// Last updated: 14/07/2026, 14:19:01
class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
       if (numerator == 0) return "0"; // Zero numerator

        StringBuilder result = new StringBuilder();

        // Handle negative sign
        if ((numerator < 0) ^ (denominator < 0)) {
            result.append("-");
        }

        // Use long to prevent overflow
        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);

        // Integer part
        result.append(num / den);
        long remainder = num % den;
        if (remainder == 0) return result.toString(); // Exact division

        // Decimal part
        result.append(".");
        Map<Long, Integer> map = new HashMap<>(); // remainder -> index in result

        while (remainder != 0) {
            if (map.containsKey(remainder)) {
                int index = map.get(remainder);
                result.insert(index, "(");
                result.append(")");
                break;
            }
            map.put(remainder, result.length());
            remainder *= 10;
            result.append(remainder / den);
            remainder %= den;
        }

        return result.toString();
    }
}