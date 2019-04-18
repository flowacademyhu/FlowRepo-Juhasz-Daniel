public static int summ() {
        int number = (int)(random()*5 + 5);
        int sum = 0;
        for (int i = 0; i < number; i ++) {
            sum += i;
        }
        return sum;
    }
    public static void second() {
        int n =(int)( Math.random()*5+5);
        int numb;
        int sum=0;
        int sz=1;
        int min=999;
        int max= -999;
        for (int i = 0; i < n;i++) {
            numb = (int)(Math.random()*20-10);
            System.out.println(numb);
            sum+=numb;
            sz=sz*numb;
            if (min > numb ) {
                min = numb;
            }
            if (max < numb) {
                max= numb;
            }
        }
        System.out.println(sum);
        System.out.println(sz);
        double avg = ((double)sum/n);
        System.out.println(avg);
        System.out.println(min+ " "+max);
    }
    public static void third () {
        int paratlan = 0;
        int numb = (int)(Math.random()*10-5);
        if (numb % 2 != 0) {
            paratlan++;
        }
        int sum = 0;
        int max= -10;

        while(paratlan <= 5) {
            System.out.println(paratlan + "cica");
            sum +=numb;
            if (max < numb)
                max = numb;
            numb = (int)(Math.random()*10-5);
            if (numb % 2 != 0) {
                paratlan++;
            }

        }
    }
    public static boolean fourth (char c) {
        boolean b=Character.isDigit(c);
        switch (c) {
            case '1': 
            case '2':
            case '3':
                    
            case '9': 
                return true;
            default: return false;
        }
        

    }

    public static int fifth () {
        int a = (int)(Math.random()*3+2);
        int b = (int)(Math.random()*2+2);
        int pow = 1;
        for (int  i = 0; i < b; i++) {
            pow *=a;
        }
        return pow;

    }
    public static void sixth () {
        int m = Integer.MIN_VALUE;
        int n = (int)(Math.random()*200-100);

        while (m < n) {
            System.out.println(n);
            m=n;
            n=(int)(Math.random()*200-100);
        }
    }