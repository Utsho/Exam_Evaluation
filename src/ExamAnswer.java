public class ExamAnswer {
    private String one_a,one_b,two_a,two_b,three_a,three_b,four;
    private int id;

    public void setId(int identity)
    {
        this.id = identity;
    }

    public String getOne_a() {
        return one_a;
    }

    public String getOne_b() {
        return one_b;
    }



    public String getTwo_a() {
        return two_a;
    }



    public String getTwo_b() {
        return two_b;
    }



    public String getThree_a() {
        return three_a;
    }



    public String getThree_b() {
        return three_b;
    }



    public String getFour() {
        return four;
    }

    int double_tower_hanoi(int id)
    {
        if(id == 0 || id == 1)return id;
        return (2 * double_tower_hanoi(id - 2) + 2);
    }

    int josephus(int N, int q)
    {
        int D = 1;
        this.two_a += D + ", ";
        while(D <= (q - 1) * N)
        {
            D = (int) Math.ceil( ( (double)q / (double)(q-1) ) * (double)D);
            this.two_a += D + ", ";
        }
        return (q*N + 1 - D);
    }

    int GCD(int m, int n)
    {
        if(m == 0)return n;
        int param = n % m;
        this.two_b += param+", ";
        return GCD(param, m);
    }

    public void process()
    {
        int N = id % 100 + 1728;
        int K = (int) Math.floor(Math.cbrt(N));
        int answer = (int) Math.floor( (double)((double)(N)/ (double)(K)) +  (double)(0.50 * (double)(K) * (double)(K)) + (double)(2.50 * (double)(K)) - 3.0);
        this.one_a = "N = " + N + ", K = "+ K +", Result = " + answer;

        N = id % 6 + 5;
        answer = double_tower_hanoi(N);
        this.one_b = "N = "+ N + ", Result = "+answer;

        N = (id + 2) % 10 + 20;
        int q = id % 4 + 3;
        this.two_a = "N = "+ N + ", q = "+ q + ", Iterations = ";
        answer = josephus(N, q);
        this.two_a += " Result: "+ answer;

        N = id % 100 + 50;
        q = N + 1000;
        this.two_b = "N1 = "+N+", N2 = "+q + ", First Params: ";
        answer = GCD(N,q);
        this.two_b += " Result: "+ answer;

        N = id % 2 + 1;
        this.three_a = "N = "+N;

        N = id % 4 + 1;
        q = (id + 1) % 5 + 1;
        K = (id + 2) % 6 + 1;
        this.three_b = "an = " + N + ", bn = "+ q +", cn = " + K;

        N = id % 3 + 1;
        K = id % 4 + 2;
        this.four = "N1 = " + N + ", N2 = "+ K ;

    }

}
