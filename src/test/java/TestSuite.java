import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Test;
import models.ListOfMessages;

import static models.Constants.*;
import static verifications.MessagesVerifications.*;

/**
 * Created by szhuk on 21.02.2018.
 */
public class TestSuite {
    @Test
    public void testListOfAllMessagesMethod() {

        Gson gson = new GsonBuilder().create();
        String inputJson = CORRECT_JSON;
//        String inputJson = INCORRECT_RESPONSE_FROM_API;

        //verification that method returns correct response
        verificationThatMethodReturnsCorrectResponse(gson, inputJson, LIST_ALL_MESSAGES_METHODNAME);

        //if response is correct than we can parse this response to listOfMessages which can be used for verification
        ListOfMessages listOfMessages = gson.fromJson(inputJson, ListOfMessages.class);

        //We should verify that all messages have correct structure
        verificationCorrectnessOfFieldsForMessageList(listOfMessages);

    }

    @Test
    public void testListOfReadMessagesMethod() {
        Gson gson = new GsonBuilder().create();
        String inputJson = CORRECT_JSON;

        //verification that method returns correct response
        verificationThatMethodReturnsCorrectResponse(gson, inputJson, LIST_READ_MESSAGES_METHODNAME);

        //if response is correct than we can parse this response to ethalonListOfReadMessages which can be used for verification
        ListOfMessages ethalonListOfReadMessages = gson.fromJson(inputJson, ListOfMessages.class);

        //We should verify that all messages have correct structure
        verificationCorrectnessOfFieldsForMessageList(ethalonListOfReadMessages);

        //We change original ethalonListOfReadMessages so this array will contain only read messages
        ethalonListOfReadMessages.createListWithReadMessages();

        //Verification that ethalonListOfReadMessages contains only read messages
        verificationThatAllMessagesAreRead(ethalonListOfReadMessages);

        // In this part of code we should call
        // /v1/messages?read=true
        // after that we should parse this response into new readMessages list
        // we should validate correctness of fields for this list using verificationCorrectnessOfFieldsForMessageList
        // and perform verificationThatAllMessagesAreRead for this list.
        // after that we should compare readMessages and ethalonListOfReadMessages
        // Using one of following approach:
        // 1:using equals ( or more particular case using HashSet value)
        // 2:using transformation to ArrayList type for both lists and comparison between arrays item by item
    }

    @Test
    public void testArchiveMessageMethod() {
        Gson gson = new GsonBuilder().create();

        String inputJson = ARCHIVED_MESSAGES24_26;
        //JSON above contains archived messages with uid from 24 to 26

        int messageIdWhichWillBeMarkedAsArchived = 0;
        //First message with uid = 21 will be used for verification. That why we put 0 for this int variable
        //In ARCHIVED_MESSAGES24_26 first messages has no
        //value for archived field = null. Current assumption that null = false which means that this message is not
        //archived

        //verification that method returns correct response for getting all messages
        verificationThatMethodReturnsCorrectResponse(gson, inputJson, ARCHIVE_MESSAGE_METHODNAME);

        //if response is correct than we can parse this response to ethalonArchivedMessages which can be used to
        //verify expected result
        ListOfMessages ethalonArchivedMessages = gson.fromJson(inputJson, ListOfMessages.class);

        //We should verify that all messages have correct structure
        verificationCorrectnessOfFieldsForMessageList(ethalonArchivedMessages);

        //Following command changes archived attribute to true for target message inside local
        // ethalonArchivedMessages array
        ethalonArchivedMessages.getMessages().get(messageIdWhichWillBeMarkedAsArchived).setArchived(true);

        //after that we should keep only archived messages inside local ethalonArchivedMessages array
        ethalonArchivedMessages.createListWithArchivedMessages();

        //verification that ethalonArchivedMessages contains only archived messages
        verificationThatAllMessagesAreArchived(ethalonArchivedMessages);
        // In this part of code we should call
        // PATCH /v1/messages/1 BODY {"archived": true}
        // for first message
        // after that we should get all messages from server
        // to new updatedArchivedMessages list
        // and perform verification verificationThatAllMessagesAreArchived for this list
        // after that we should compare updatedArchivedMessages and ethalonArchivedMessages
        // Using one of following approach:
        // 1:using equals ( or more particular case using HashSet value)
        // 2:using transformation to ArrayList type for both lists and comparison between arrays item by item
    }
}