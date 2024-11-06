package Solution;

public class LetsDoEnums 
{
    // Enum representing different flavors of ice cream.
    enum Flavor 
    {
        CHOCOLATE,  // Chocolate flavor
        VANILLA,    // Vanilla flavor
        STRAWBERRY; // Strawberry flavor
        
        // Method to print out the Chocolate flavor.
        public static void getChocolate() 
        {
            System.out.println(Flavor.CHOCOLATE); // Output the name of the Chocolate flavor
        }

        // Method to print out the Vanilla flavor.
        public static void getVanilla() 
        {
            System.out.println(Flavor.VANILLA); // Output the name of the Vanilla flavor
        }

        // Method to print out the Strawberry flavor.
        public static void getStrawberry() 
        {
            System.out.println(Flavor.STRAWBERRY); // Output the name of the Strawberry flavor
        }

        // Optional: We can add a method to list all available flavors
        public static void listFlavors() 
        {
            // Loop through all the values of the Flavor enum and print them
            for (Flavor flavor : Flavor.values()) 
            {
                System.out.println(flavor);
            }
        }
    }
    
    public static void main(String[] args) 
    {
        // Example usage: Printing Vanilla flavor
        Flavor.getVanilla(); // This calls the static method for Vanilla flavor

        // Optional: List all available flavors using the newly added method
        // Flavor.listFlavors();
    }
}
