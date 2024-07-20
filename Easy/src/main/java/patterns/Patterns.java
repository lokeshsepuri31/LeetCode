package patterns;

public class Patterns {

    public static void printSquare(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printReverseTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printEquilateralTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 2 * i - 1; k > 0; k--) {
                System.out.print("*");
            }
            for (int l = n - i; l > 0; l--) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void printReverseEquilateralTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }

            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void printDiamond(int n) {
        printEquilateralTriangle(n);
        printReverseEquilateralTriangle(n);
    }

    public static void printHalfDiamond(int n) {
        for (int i = 1; i < 2 * n; i++) {
            int stars = i;
            if (i > n) stars = 2 * n - i;
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printBinaryTriangle(int n) {
        int start = 1;
        for (int i = 0; i < n; i++) {
            start = i % 2 == 0 ? 1 : 0;
            for (int j = 0; j <= i; j++) {
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }
    }

    public static void printHallowHalfDiamond(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1);
            }
            for (int j = 0; j < 2 * n - 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void printNumberedRightAngledTriangle(int n) {
        int number = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                number++;
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

    public static void printAlphabeticalRightAngledTriangle(int n) {
        for (int i = 0; i < n; i++) {
            int ascii = 65;
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ascii);
                ascii++;
            }
            System.out.println();
        }
    }

    public static void printAlphabeticalReverseRightAngledTriangle(int n) {
        for (int i = 0; i < n; i++) {
            int ascii = 65;
            for (int j = 0; j < n - i; j++) {
                System.out.print((char) ascii);
                ascii++;
            }
            System.out.println();
        }
    }

    public static void printAlphabeticalTriangle(int n) {
        int ascii = 65;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ascii);
            }
            System.out.println();
            ascii++;
        }
    }

    public static void printReverseAlphabeticalTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (char j = (char) ('E' - i); j <= 'E'; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void printAlphabeticalEquilateralTriangle(int n) {
        for (int i = 1; i < n; i++) {
            int ascii = 65;

            //spaces
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }

            int breakpoint = (2 * i + 1) / 2;
            //stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print((char) ascii);
                ascii = (j < breakpoint) ? ascii + 1 : ascii - 1;
            }

            //spaces
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void printHallowDiamond(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            for (int k = 2 * i; k > 0; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * n - 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void print20(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * n - 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * n - 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void printHallowSquare(int n) {
        int boundary = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printNumberSquare(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int top = i;
                int left = j;
                int right = (2*n -2) - j;
                int down = (2*n - 2) - i;
                System.out.print(n - Math.min(Math.min(top,down), Math.min(left,right)));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printNumberSquare(4);
    }
}