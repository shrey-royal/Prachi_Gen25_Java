import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String phrase = "\nThe impacts of climate change are becoming increasingly evident across the globe. Reports from scientific studies, governmental agencies, and environmental organizations all highlight the pressing issues at hand. Rising temperatures, melting glaciers, erratic weather patterns, and sea-level rise are among the many consequences documented.\n\nIn the Arctic, the effects of climate change are starkly visible. Ice sheets are shrinking, polar bears are losing their habitats, and indigenous communities are facing unprecedented challenges due to thawing permafrost. These changes not only affect the local ecosystems but also have far-reaching implications for the entire planet.\n\nFurthermore, the discourse around climate change has intensified in recent years. People are demanding immediate action from policymakers, urging the adoption of sustainable practices and the reduction of carbon emissions. The urgency to mitigate the impacts of climate change has never been greater.\n\nScientists continue to conduct extensive research to understand the complexities of this global issue. Models predict more extreme weather events, prolonged droughts, and heightened risks to biodiversity if substantial measures are not taken swiftly.\n\nIt is evident that addressing climate change requires a multidimensional approach involving governments, businesses, communities, and individuals. Collaboration and concerted efforts are essential to combat this existential threat to our planet's future.";

        System.out.println(phrase);

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a word or a phrase to search: ");
        String word = sc.nextLine();
        sc.close();

        int index = phrase.indexOf(word), count=0;

        while (index != -1) {
            System.out.println("Found at index: " + index);
            count++;
            index = phrase.indexOf(word, index+1);  //will start scanning again from the next index
        }

        if(count == 0) System.out.println("Word not found!");
        else System.out.println("Total occurrences: " + count);

    }
}
