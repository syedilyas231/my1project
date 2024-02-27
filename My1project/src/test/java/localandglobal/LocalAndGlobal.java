package localandglobal;

public class LocalAndGlobal {
    int a = 31;  // global

    public static void main(String[] args) {
    }

        public void m1 () {
            int a = 12; // local
            System.out.println(a);
        }
        public void m2 () {
            System.out.println(a);
        }
    }


