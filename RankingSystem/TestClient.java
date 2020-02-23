import java.io.*;
//import java.io.PrintStream;

public class TestClient {

	public static void main(String[] args) {
		// file is 27 cols x 127 
		String row;
		BufferedReader csvReader;
		PersonalStat[] player;
		
		try {
			player = new PersonalStat[126];
			String[] data = null;
			
			csvReader = new BufferedReader(new FileReader("2K_Player_Stats.csv"));
			int i = 0;
			csvReader.readLine();
			while ((row = csvReader.readLine()) != null) {
				data = row.split(",");
				player[i] = new PersonalStat(data);
				i++;
			}
		} catch (IOException e) {
			System.out.print("No file");
			return;
		}
		
		double[] per = new double[126];
		String[] name = new String[126];
		String[] team = new String[126];
		for (int k = 0; k < player.length; k++) {
			per[k] = player[k].getPER();
			name[k] = player[k].getPlayer();
			team[k] = player[k].getTeam();
		}
		quickSort(per, name, team, 0, player.length-1);
		
		try {
			PrintStream writetoEngineer = new PrintStream(
				     new FileOutputStream("PER_Stat.txt", true)); 
			writetoEngineer.println("Player,PER,Team,");
			for (int k = player.length-1; k >= 0; k--)
				writetoEngineer.printf("%s,%.2f,%s,\n",name[k],per[k],team[k]);
		} catch (IOException e) {
			System.out.print("Error!!!");
			return;
		}
	}
	
	public static void quickSort(double[] PER, String[] name, String[] team, int low, int high) {
	    if (low < high) {
	        /* pi is partitioning index, arr[pi] is now
	           at right place */
	        int pi = partition(PER, name, team, low, high);

	        quickSort(PER, name, team, low, pi - 1);  // Before pi
	        quickSort(PER, name, team, pi + 1, high); // After pi
	    }
	}
	
	public static int partition(double[] PER, String[] name, String[] team, int low, int high) {
		double pivot = PER[high];  
        int i = (low-1); // index of smaller element 
        for (int j=low; j<high; j++) { 
            // If current element is smaller than the pivot 
            if (PER[j] < pivot) { 
                i++; 
                // swap arr[i] and arr[j] 
                double temp = PER[i]; 
                PER[i] = PER[j]; 
                PER[j] = temp; 
                String tempName = name[i];
                name[i] = name[j];
                name[j] = tempName;
                String tempStr = team[i];
                team[i] = team[j];
                team[j] = tempStr;
            } 
        } 
  
        // swap arr[i+1] and arr[high] (or pivot) 
        double temp = PER[i+1]; 
        PER[i+1] = PER[high]; 
        PER[high] = temp;
        String tempName = name[i+1];
        name[i+1] = name[high];
        name[high] = tempName;
        String tempStr = team[i+1];
        team[i+1] = team[high];
        team[high] = tempStr;
  
        return i+1; 
	}
}
