public class Sequences {

    // Read REQ 02
    public int sumOfFirst(int n) {
        int total = 0;
        for (; n > 0; n--) {
            total += n;
        }
        return total;
    }

    // Read REQ 03
    public String countUp(int start, int limit) {
        String result = "";
        result += start;
        start += 1;
        if (start < limit) {
            return "";
        }
        for (; start <= limit; start++) {
            result += " ";
            result += start;
        }
        return result;
    }

    // Read REQ 04
    public String countByThrees(int start, int limit) {
        String result = "";
        result += start;
        if (start < limit) {
            return "";
        }
        for (int n = start + 3; n <= limit; n += 3) {
            result += " ";
            result += n;

        }
        return result;
    }

    // Read REQ 05
    public int productOfFirst(int n) {
        int result = 1;
        for (; n > 0; n--) {
            result *= n;
        }
        return result;
    }

    // Read REQ 06
    public int countMultiples(int n, int factor) {
        int count = 0;
        int i = n;
        for (; n > 0; n--) {
            if (i / n == factor) {
                count += n;
            }

        }
        return count;
    }

    // Read REQ 07
    public String repeat(String s, int times) {
        String result = "";
        for (; times > 0; times--) {
            result += s;
        }
        return result;
    }

    // Read REQ 08
    public int power(int base, int exponent) {
        int result = 1;
        for (; exponent > 0; exponent--) {
            result *= base;
        }
        return result;
    }
}
