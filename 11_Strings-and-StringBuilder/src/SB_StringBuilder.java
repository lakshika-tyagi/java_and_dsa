public class SB_StringBuilder {
    static void main() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        System.out.println(builder);

        builder.reverse();
        System.out.println(builder);
        builder.reverse();

        builder.deleteCharAt(0);
        System.out.println(builder);

        builder.setLength(20);
        System.out.println(builder);

        builder.insert(20,'a');
        System.out.println(builder);

        builder.replace(0,2,"012");
        System.out.println(builder);
        builder.replace(0,3,"ABC");
        System.out.println(builder);

        builder.delete(0,1);
        System.out.println(builder);

        builder.delete(19,19);
        System.out.println(builder);

    }
}
