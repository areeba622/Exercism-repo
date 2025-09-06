class SqueakyClean {
    static String clean(String identifier) {

        // Step 1: Replace common leetspeak characters with letters
        identifier = identifier.replace('4', 'a')
                               .replace('3', 'e')
                               .replace('0', 'o')
                               .replace('1', 'l')
                               .replace('7', 't');

        // Step 2: Replace spaces with underscores
        String convert = identifier.replaceAll(" ", "_");

        // Step 3: Build the cleaned result
        StringBuilder result = new StringBuilder();
        boolean capitalize = false;

        // Step 4: Loop through each character
        char[] characters = convert.toCharArray();

        for (int i = 0; i < characters.length; i++) {
            char c = characters[i];

            if (c == '-') {  
                // Dash → next valid character should be uppercase
                capitalize = true;
                continue;
            }

            if (!Character.isLetterOrDigit(c) && c != '_') {
                // Skip any unwanted special characters (e.g., ¡, !, etc.)
                continue;
            }

            if (capitalize) {
                // Convert this character to uppercase if flag is set
                result.append(Character.toUpperCase(c));
                capitalize = false;
            } else {
                // Otherwise, append as is
                result.append(c);
            }
        }

        // Step 5: Return the cleaned string
        return result.toString();
    }
}
