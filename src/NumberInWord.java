public class NumberInWord {

    public static void printNumberInWord (int number) {

        String stringNumber;

        switch (number) {
            case 0:
                stringNumber = "ZERO";
                break;
            case 1:
                stringNumber = "ONE";
                break;
            case 2:
                stringNumber = "TWO";
                break;
            case 3:
                stringNumber = "THREE";
                break;
            case 4:
                stringNumber = "FOUR";
                break;
            case 5:
                stringNumber = "FIVE";
                break;
            case 6:
                stringNumber = "SIX";
                break;
            case 7:
                stringNumber = "SEVEN";
                break;
            case 8:
                stringNumber = "EIGHT";
                break;
            case 9:
                stringNumber = "NINE";
                break;
            default:
                stringNumber = "OTHER";
                break;
        };

        System.out.println(stringNumber);
    }
}
