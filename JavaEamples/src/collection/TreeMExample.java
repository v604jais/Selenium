package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TreeMExample extends String_Repeatation{

	public static void main(String[] args) {
		
		String S="he is a boy and he can play game and game and and";
		String[] Words=S.split("\\s");
		int No_of_Words=Words.length;
		System.out.println(No_of_Words);
		HashSet<String> SetList=new HashSet<String>();
		 ArrayList<String> list=new ArrayList<String>();
		for(int i=0;i<Words.length;i++) {
			
		    SetList.add(Words[i]);
			list.add(Words[i]);
			
				}
		int UniqueWords=SetList.size();
		System.out.println("No of duplicate Words are "+(No_of_Words-UniqueWords));
		System.out.println(SetList);
		System.out.println("Duplicate words are "+ processList(list));
		
		
		
		
		
	}	
	public static Set<String> processList(List<String> listContainingDuplicates) {

		final Set<String> resultSet = new HashSet<String>();
		final Set<String> tempSet = new HashSet<String>();

		for (String yourInt : listContainingDuplicates) {
			if (!tempSet.add(yourInt)) {
				resultSet.add(yourInt);
			}
		}
		return resultSet;

  }
}