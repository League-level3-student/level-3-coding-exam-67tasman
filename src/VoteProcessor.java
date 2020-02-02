import java.util.ArrayList;
import java.util.HashMap;

public class VoteProcessor extends Level3CodingExam{
	
	public static void main(String args[]){
	
		
	}
	public String calculateElectionWinner(ArrayList<String> v) {
		int pope = 0;
		int ed = 0;
		String res = "";
		for(int i = 65; i < 90 ; i ++) {
			for(int j = 0; j < v.size() ; j ++) {
				String caps = i+"";
				String low = (i+32) + "";
				if(v.get(j)==caps){
					v.get(j).equals(low);
				}
			}
		}
		
		for(int i = 0; i < v.size() ; i ++) {
			if(v.get(i).contains("pope")) {
			pope++;
			}
			if(v.get(i).contains("edward")) {
				ed++;
				}
		}
		
		if(ed == pope) {
			res = "TIE";
		}
		if(ed < pope) {
			res = "pope francis";
		}
		if(ed > pope) {
			res = "edward snowden";
		}
		return res;
		
	}
	
	
	
}
