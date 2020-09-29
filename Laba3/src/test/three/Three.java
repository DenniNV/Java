package test.three;

// MAKE BY NAUMENKOV DENIS
public class Three {
    private final static StringBuilder sb = new StringBuilder();

    public static String reverse (final String word) {
        sb.setLength(0);
        sb.append(word.toCharArray());

        return sb.reverse().toString();
    }

    public static void main (String [] args) {
        String [] result = new String[args.length];
        int j = 0;

        for (int i = args.length - 1; i >= 0; i--) {
            result[j++] = reverse(args[i]);
        }

        for (String s : result) {
            System.out.println(s);
        }
    }
}
