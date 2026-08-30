public class StringBuilderToolkit {

    static String reverse(String text) {
        if (text == null)
            return null;

        StringBuilder sb = new StringBuilder(text);
        return sb.reverse().toString();
    }

    static String repeat(String text, int count) {
        if (text == null || count < 0)
            return null;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++)
            sb.append(text);

        return sb.toString();
    }

    static String joinWords(String[] words, String separator) {
        if (words == null || separator == null)
            return null;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            sb.append(words[i]);

            if (i < words.length - 1)
                sb.append(separator);
        }

        return sb.toString();
    }

    static String removeCharacterAt(String text, int index) {
        if (text == null || index < 0 || index >= text.length())
            return null;

        StringBuilder sb = new StringBuilder(text);
        sb.deleteCharAt(index);

        return sb.toString();
    }

    static String replaceCharacterAt(String text, int index, char replacement) {
        if (text == null || index < 0 || index >= text.length())
            return null;

        StringBuilder sb = new StringBuilder(text);
        sb.setCharAt(index, replacement);

        return sb.toString();
    }

    static String buildNumberedList(String[] items) {
        if (items == null)
            return null;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < items.length; i++) {
            sb.append(i + 1);
            sb.append(". ");
            sb.append(items[i]);
            sb.append("\n");
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        System.out.println(reverse("Java"));
        System.out.println(repeat("Hi ", 3));

        String[] words = {"Java", "Python", "C++"};
        System.out.println(joinWords(words, ", "));

        System.out.println(removeCharacterAt("Hello", 1));
        System.out.println(replaceCharacterAt("Hello", 1, 'a'));

        System.out.println(buildNumberedList(words));

        StringBuilder sb = new StringBuilder("Hello");
        String result = sb.toString();
        sb.append(" World");

        System.out.println(result);
        System.out.println(sb);
    }
}