public class Question01 {
    /*
        String Compression:
        Implement a method to perform basic string compression using the counts of repeated characters.
        For example, the string aabcccccaaa would become a2b1c5a3.
        If the "compressed" string would not become smaller than the original string, your method should return the original string.
        You can assume the string has only uppercase and lowercase letters (a - z).
         */

        public String compressString (String str) {
            if(str == null || str.length() <= 2 ) {
                return str;
            }

            int start = 0 ;
            int end = 1;
            StringBuilder stringbuilder = new StringBuilder();
            while( end < str.length() ) {
                while( end < str.length() && str.charAt(end)  == str.charAt(end - 1) ) {
                    end++;
                }
                stringbuilder.append(str.charAt(start) + "" + (end - start) );
                start = end;
                end++;
            }

            String res = stringbuilder.toString();

            return (res.length() < str.length() ) ? res : str;

        }

    }


