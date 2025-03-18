class reverse {
    public static void main(String[] args) {
        // Predefined input number
        int number = 12345;  // You can change this value to test with different numbers
        
        // Variable to store the reversed number
        int reversedNumber = 0;
        
        // Logic to reverse the number
        while (number != 0) {
            int digit = number % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append digit to reversed number
            number = number / 10; // Remove the last digit from the original number
        }
        
        // Output the reversed number
        System.out.println("Reversed number: " + reversedNumber);
    }
}

