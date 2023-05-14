package lesson0.eolymp;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Pr4487 {
    static int [] a;
    static Node4487 [] t;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        a = new int[n+1];
        t = new Node4487[4*n+n];
        for(int i=1; i<=n; i++) {
            a[i] = in.nextInt();
        }

        build(1,1,n);
        //Arrays.stream(t).forEach(val -> System.out.println(val));

        int m = in.nextInt();
        int x,l,r;
        for(int i=1; i<=m; i++){
            x = in.nextInt();
            l = in.nextInt();
            r = in.nextInt();
            if(x == 1) System.out.println(query(1,1,n,l,r).max);
            else update(1,1,n,l,r);
        }
    }

    private static void build(int node, int l, int r){
        if(l>r || r<1) return;

        if(l == r){
            t[node] = new Node4487(node, l,r,1,1,1);
            return;
        }

        int mid = (l+r)/2;
        build(2*node, l, mid);
        build(2*node+1, mid+1, r);
        t[node] = generate(node, t[2*node], t[2*node+1], l, r);
    }

    private static Node4487 generate(int node, Node4487 left, Node4487 right, int l, int r){
        int mid = (l+r)/2;
        int maxPre=left.maxPre;
        if(a[mid] <= a[mid+1] && left.maxPre == mid-l+1){
            maxPre = left.maxPost + right.maxPre;
        }
        int maxPost=right.maxPost;
        if(a[mid] <= a[mid+1] && right.maxPost == r-mid){
            maxPost = left.maxPost + right.maxPre;
        }
        int max= Math.max(left.max, right.max);
        if(a[mid] <= a[mid+1]){
            max = Math.max(max, left.maxPost + right.maxPre);
        }
        return new Node4487(node,l,r,maxPre,max,maxPost);
    }

    private static Node4487 query(int node, int l, int r, int start, int end){
        if(l > end || r < start) return new Node4487(0,0,0,0,0,0);
        if(l >= start && r <= end) return t[node];

        int mid = (l+r)/2;
        Node4487 ansLeft = query(2*node,l,mid,start,end);
        Node4487 ansRight = query(2*node+1,mid+1,r,start,end);

        if(Node4487.isNull(ansLeft)) return ansRight;
        else if(Node4487.isNull(ansRight)) return ansLeft;

        return generate(node, ansLeft, ansRight, l, r);
    }

    private static void update(int node, int l, int r, int ind, int val){
        if(l > r || r < 1) return;
        if(l == r && l == ind){
            a[l] = val;
            t[node] = new Node4487(node,l,r,1,1,1);
            return;
        }

        int mid = (l+r)/2;
        if(ind <= mid) {
            update(2*node,l,mid,ind,val);
        } else{
            update(2*node+1,mid+1,r,ind,val);
        }
        t[node] = generate(node, t[2*node], t[2*node+1], l, r);
    }
}

class Node4487 {
    int ind,left,right,maxPre,max,maxPost;
    public Node4487(int ind, int left, int right, int maxPre, int max, int maxPost){
        this.ind = ind;
        this.left = left;
        this.right = right;
        this.maxPre = maxPre;
        this.max = max;
        this.maxPost = maxPost;
    }

    public String toString(){
        return Stream.of(ind, left, right, maxPre, max, maxPost)
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }

    public static boolean isNull(Node4487 node){
        return node.max == 0
                && node.maxPre == 0
                && node.maxPost == 0;
    }
}

 /*
 explanation by mtariverdiyev05
Salam, bəli hər iki məsələnin də həlli segment tree ilə olacaq. Birinci sadəcə position update olduğu üçün simple segment tree, digəri isə range update olduğu üçün lazy segment tree olmalıdır.
Məsələnin həllinə gəldikdə isə segment tree - nin hər bir node - u üçün 3 məlumat saxlamaq olar (Max, Max_preff, Max_suff). Burada Max -> bizim [l, r] aralığındakı cavabı yəni maximum uzunluqlu
azalmayan sequence - in ölçüsünü bildirir. Bunu tapmaq üçün isə bizə Max_preff və Max_suff məlumatları lazım olacaq. Uyğun olaraq, Max_Preff -> l - dən müəyyən i - yə qədər (i <= r) öndən maximum
uzunluqlu azalmayan sequence - in ölçüsünü, Max_Suff -> r - dən müəyyən i - yə qədər (i >= l) sondan maximum uzunluqlu azalmayan sequence - in ölçüsünü saxlayır. Bunları ümumilikdə bu cür fikirləşmək olar:

Məs : {1, 2, 3, 4, 1, 2, 3} elementləri üçün Max_preff = 4 olacaq hansı ki öndən ilk 4 element azalmayan olduğuna görə, Max_suff = 3 olacaq hansı ki sondan ilk 3 element
azalmayan olduğuna görə. Ümumi cavab isə Max = 4 {1, 2, 3, 4} olacaq.

Əgər P segment tree - də müəyyən bir node, L onun sol və R sağ node - u olarsa, P - ni bu cür hesablamaq olar.

Məs : P {1, 2, 5, 4, 3, 1, 2, 4} elementlərinin ehtiva edir. L {1, 2, 5, 4} R{3, 1, 2, 4} elementlərini ehtiva edəcək. L.MAX = 3 yəni {1, 2, 5}, L.preff = 3 yəni {1, 2, 5} L.suff = 1 yəni {4}
R.MAX = 3 yəni {1, 2, 4}, R.preff = 1 yəni {3}, R.suff = 3 yəni {1, 2, 4} olacaq.

P.MAX = max(L.MAX, R.MAX) kimi çıxarıla bilər. Yəni sol massivdəki max uzunluqlu azalmayan sequence ilə sağ massivdəki max uzunluqlu azalmayan sequence-lərdən max uzunluqlu olanını.
Bundan əlavə olaraq L - in sonuncu elementi R - in 1 -ci elementindən də <= olarsa, L.suff və R.preff ləri birləşdirmək olar. P.MAX = max(P.MAX, L.suff + R.preff)

P L və R - i özündə birləşdirdiyinə görə P - də öndən gələn max uzunluqlu sequence L - dəki olacaq. Ona görə də P.preff = L.preff. Əlavə bir halda L - dəki bütün ədədlər azalmayan və
L - in axırıncı ədədi R - in birinci ədədindən <= olarsa P.preff = L.MAX + R.preff olar.

P L və R - i özündə birləşdirdiyinə görə P - də sondan gələn max uzunluqlu sequence R - dəki olacaq. Ona görə də P.suff = R.suff. Əlavə bir halda R - dəki bütün ədədlər azalmayan və
L - in axırıncı ədədi R - in birinci ədədindən <= olarsa P.suff = R.MAX + L.suff olar.

Hər bir node üçün bu məlumatlar hesablanacaq və [l,r] aralığına bunlardan istifadə edib cavab vermək olar. İkincidə isə [l, r] aralığında eyni ədədlər yazıldığına görə oranı full götürmək olar.
Sadəcə birinci məsələdə bunu dəyişməklə ikincini də həll etmək olur. Ümid edirəm ki, sizə faydalı olar.Segment tree - ni https://cp-algorithms.com/ saytından öyrənmişəm.
  */