import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class TweetReciever {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame newframe = new JFrame();
		JPanel newpanel = new JPanel();
		newframe.setVisible(true);
		newframe.setSize(400, 100);
		JButton search = new JButton("Search the Twitterverse");
		search.setSize(200,75);
		newpanel.add(search);
		search.addActionListener(this);
		JTextField searchbar = new JTextField(20);
		
		
		newpanel.add(searchbar);
		
		newframe.add(newpanel);
		newframe.pack();
		

	}
	
	private static String getLatestTweet(String searchingFor) {

	      Twitter twitter = new TwitterFactory().getInstance();

	      AccessToken accessToken = new AccessToken(
	            "2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
	            "vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");

	      twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
	            "6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");

	      twitter.setOAuthAccessToken(accessToken);

	      Query query = new Query(searchingFor);
	      try {
	            QueryResult result = twitter.search(query);
	            return result.getTweets().get(0).getText();
	      } catch (Exception e) {
	            System.err.print(e.getMessage());
	            return "What the heck is that?";
	            
	      }
	      
	}
	
}
