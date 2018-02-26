package verifications;

import com.google.gson.Gson;
import models.ListOfMessages;

import static org.junit.Assert.assertFalse;

/**
 * Created by szhuk on 21.02.2018.
 */
public class MessagesVerifications {
    public static Boolean errorNotAllMessagesAreArchived = false;
    public static Boolean errorNotAllMessagesAreRead = false;
    public static Boolean errorVerificationField = false;
    public static Boolean errorEmptyField = false;

    public static void verificationCorrectnessOfFieldsForMessageList(ListOfMessages listOfMessages) {
        for (int i = 0; i < listOfMessages.size(); i++) {

            //Verification that uid has positive value
            try {
                if ((listOfMessages.getMessages().get(i).getUid() <= 0)) {
                    errorVerificationField = true;
                    assertFalse("UIF for message number " + i + " is negative. Current value is " +
                            listOfMessages.getMessages().get(i).getUid(), errorVerificationField);
                    break;
                }

            }
            //Verification that uid field exists
            catch (NullPointerException npe) {
                errorEmptyField = true;
                assertFalse("UID for message number " + i + " doesn't exist.", errorEmptyField);
                break;
            }

            //Verification that Sender field is not empty
            try {
                if (listOfMessages.getMessages().get(i).getSender().length() == 0) {
                    errorVerificationField = true;
                    assertFalse("Sender field for message number " + i + " is empty.", errorVerificationField);
                    break;
                }

            }
            //Verification that Sender field exists
            catch (NullPointerException npe) {
                errorEmptyField = true;
                assertFalse("Sender field for message number  " + i + " doesn't exist.", errorEmptyField);
                break;
            }

            //Verification that Subject field is not empty
            try {
                if (listOfMessages.getMessages().get(i).getSubject().length() == 0) {
                    errorVerificationField = true;
                    assertFalse("Subject field for message number " + i + " is empty.", errorVerificationField);
                    break;
                }

            }
            //Verification that Subject field exists
            catch (NullPointerException npe) {
                errorEmptyField = true;
                assertFalse("Subject field for message number  " + i + " doesn't exist.", errorEmptyField);
                break;
            }

            //Verification that message body is not empty
            try {
                if (listOfMessages.getMessages().get(i).getMessage().length() == 0) {
                    errorVerificationField = true;
                    assertFalse("Message number " + i + " is empty.", errorVerificationField);
                    break;
                }

            }
            //Verification that message body exists
            catch (NullPointerException npe) {
                errorEmptyField = true;
                assertFalse("Message number " + i + " doesn't exist.", errorEmptyField);
                break;
            }

            //Verification that timeSent has positive value
            try {
                if ((listOfMessages.getMessages().get(i).getTimeSent() <= 0)) {
                    errorVerificationField = true;
                    assertFalse("Time sent for message number " + i + " is negative. Current value is " +
                            listOfMessages.getMessages().get(i).getTimeSent(), errorVerificationField);
                    break;
                }

            }
            //Verification that timeSent field exists
            catch (NullPointerException npe) {
                errorEmptyField = true;
                assertFalse("Time sent for message number " + i + " doesn't exist.", errorEmptyField);
                break;
            }
        }
    }

    public static void verificationThatAllMessagesAreArchived(ListOfMessages listOfMessages) {
        for (int i = 0; i < listOfMessages.size(); i++) {
            if (!(listOfMessages.getMessages().get(i).getArchived())) {
                errorNotAllMessagesAreArchived = true;
                assertFalse("It was expected that message number " + listOfMessages.getMessages().get(i).getUid() + " is archived but it's not. Archive status for this message is " +
                        listOfMessages.getMessages().get(i).getArchived(), errorNotAllMessagesAreArchived);
                break;
            }
        }
    }

    public static void verificationThatAllMessagesAreRead(ListOfMessages listOfMessages) {
        for (int i = 0; i < listOfMessages.size(); i++) {
            if (!(listOfMessages.getMessages().get(i).getIs_read())) {
                errorNotAllMessagesAreRead = true;
                assertFalse("It was expected that message number " + listOfMessages.getMessages().get(i).getUid() + " is read but it's not. Read status for this message is " +
                        listOfMessages.getMessages().get(i).getIs_read(), errorNotAllMessagesAreRead);
                break;
            }
        }
    }

    public static void verificationThatMethodReturnsCorrectResponse(Gson gson, String inputJson, String methodName) {
        try {
            gson.fromJson(inputJson, ListOfMessages.class);
        } catch (IllegalStateException exception) {

        } catch (Throwable throwable) {

            assertFalse("Incorrect response for " + methodName + " method", true);
        }
    }
}