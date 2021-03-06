package statustwitter;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 * Clase para recobrar los twitts del morrazo
 *
 * @author damian
 */
public class StatusTwitter {

    /**
     * @param args linea de argumentos
     * @throws twitter4j.TwitterException
     */
    public static void main(String[] args) throws TwitterException {

        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("xxxx")
                .setOAuthConsumerSecret("xxxxxx")
                .setOAuthAccessToken("xxxxxxx")
                .setOAuthAccessTokenSecret("xxxxxx");
        TwitterFactory th = new TwitterFactory(cb.build());
        Twitter rSocial = th.getInstance();

        Query busqueda = new Query("#papapitufo");
        QueryResult result = rSocial.search(busqueda);
        for (Status Estos : result.getTweets()) {
            System.out.println("@" + Estos.getUser().getScreenName() + ":" + Estos.getText());
        }
    }
}
