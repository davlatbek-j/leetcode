public class DecodeURL
{
    public static void main(String[] args)
    {

        String encoded = "\u0004J\u0018NV\u0011C\u000fX\tB\nY\u0010X\nB\f^\u000fV\r\\\u000e]\u0011\u0000Q\u000b\u0011\u001fS\u001f";
        char[] chars = encoded.toCharArray();
        char[] decoded = new char[chars.length];
        int i = chars.length - 1;
        while (i >= 0)
        {
            decoded[i] = (char) (chars[i] ^ 'l');
            i--;
            if (i < 0) break;
            decoded[i] = (char) (chars[i] ^ '>');
            i--;
        }
        System.out.println(new String(decoded));
    }
}
