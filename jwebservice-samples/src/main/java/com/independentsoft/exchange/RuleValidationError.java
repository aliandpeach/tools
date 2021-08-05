package com.independentsoft.exchange;

import javax.xml.stream.*;

public class RuleValidationError
{
    private RuleFieldUri a;
    private RuleValidationErrorCode b;
    private String c;
    private String d;
    
    public RuleValidationError() {
    }
    
    RuleValidationError(final XMLStreamReader reader) throws XMLStreamException {
        this.a(reader);
    }
    
    private void a(final XMLStreamReader xmlStreamReader) throws XMLStreamException {
        while (xmlStreamReader.hasNext()) {
            if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("FieldUri") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText;
                if ((elementText = xmlStreamReader.getElementText()) != null && elementText.length() > 0) {
                    final String s;
                    this.a = ((s = elementText).equals("RuleId") ? RuleFieldUri.RULE_ID : (s.equals("DisplayName") ? RuleFieldUri.DISPLAY_NAME : (s.equals("Priority") ? RuleFieldUri.PRIORITY : (s.equals("IsNotSupported") ? RuleFieldUri.IS_NOT_SUPPORTED : (s.equals("Actions") ? RuleFieldUri.ACTIONS : (s.equals("Condition:Categories") ? RuleFieldUri.CONDITION_CATEGORIES : (s.equals("Condition:ContainsBodyStrings") ? RuleFieldUri.CONDITION_CONTAINS_BODY_STRINGS : (s.equals("Condition:ContainsHeaderStrings") ? RuleFieldUri.CONDITION_CONTAINS_HEADER_STRINGS : (s.equals("Condition:ContainsRecipientStrings") ? RuleFieldUri.CONDITION_CONTAINS_RECIPIENT_STRINGS : (s.equals("Condition:ContainsSenderStrings") ? RuleFieldUri.CONDITION_CONTAINS_SENDER_STRINGS : (s.equals("Condition:ContainsSubjectOrBodyStrings") ? RuleFieldUri.CONDITION_CONTAINS_SUBJECT_OR_BODY_STRINGS : (s.equals("Condition:ContainsSubjectStrings") ? RuleFieldUri.CONDITION_CONTAINS_SUBJECT_STRINGS : (s.equals("Condition:FlaggedForAction") ? RuleFieldUri.CONDITION_FLAGGED_FOR_ACTION : (s.equals("Condition:FromAddresses") ? RuleFieldUri.CONDITION_FROM_ADDRESSES : (s.equals("Condition:FromConnectedAccounts") ? RuleFieldUri.CONDITION_FROM_CONNECTED_ACCOUNTS : (s.equals("Condition:HasAttachments") ? RuleFieldUri.CONDITION_HAS_ATTACHMENTS : (s.equals("Condition:Importance") ? RuleFieldUri.CONDITION_IMPORTANCE : (s.equals("Condition:IsApprovalRequest") ? RuleFieldUri.CONDITION_IS_APPROVAL_REQUEST : (s.equals("Condition:IsAutomaticForward") ? RuleFieldUri.CONDITION_IS_AUTOMATIC_FORWARD : (s.equals("Condition:IsAutomaticReply") ? RuleFieldUri.CONDITION_IS_AUTOMATIC_REPLY : (s.equals("Condition:IsEncrypted") ? RuleFieldUri.CONDITION_IS_ENCRYPTED : (s.equals("Condition:IsMeetingRequest") ? RuleFieldUri.CONDITION_IS_MEETING_REQUEST : (s.equals("Condition:IsMeetingResponse") ? RuleFieldUri.CONDITION_IS_MEETING_RESPONSE : (s.equals("Condition:IsNDR") ? RuleFieldUri.CONDITION_IS_NDR : (s.equals("Condition:IsPermissionControlled") ? RuleFieldUri.CONDITION_IS_PERMISSION_CONTROLLED : (s.equals("Condition:IsReadReceipt") ? RuleFieldUri.CONDITION_IS_READ_RECEIPT : (s.equals("Condition:IsSigned") ? RuleFieldUri.CONDITION_IS_SIGNED : (s.equals("Condition:IsVoicemail") ? RuleFieldUri.CONDITION_IS_VOICE_MAIL : (s.equals("Condition:ItemClasses") ? RuleFieldUri.CONDITION_ITEM_CLASSES : (s.equals("Condition:MessageClassifications") ? RuleFieldUri.CONDITION_MESSAGE_CLASSIFICATIONS : (s.equals("Condition:NotSentToMe") ? RuleFieldUri.CONDITION_NOT_SENT_TO_ME : (s.equals("Condition:SentCcMe") ? RuleFieldUri.CONDITION_SENT_CC_ME : (s.equals("Condition:SentOnlyToMe") ? RuleFieldUri.CONDITION_SENT_ONLY_TO_ME : (s.equals("Condition:SentToAddresses") ? RuleFieldUri.CONDITION_SENT_TO_ADDRESSES : (s.equals("Condition:SentToMe") ? RuleFieldUri.CONDITION_SENT_TO_ME : (s.equals("Condition:SentToOrCcMe") ? RuleFieldUri.CONDITION_SENT_TO_OR_CC_ME : (s.equals("Condition:Sensitivity") ? RuleFieldUri.CONDITION_SENSITIVITY : (s.equals("Condition:WithinDateRange") ? RuleFieldUri.CONDITION_WITHIN_DATE_RANGE : (s.equals("Condition:WithinSizeRange") ? RuleFieldUri.CONDITION_WITHIN_SIZE_RANGE : (s.equals("Exception:Categories") ? RuleFieldUri.EXCEPTION_CATEGORIES : (s.equals("Exception:ContainsBodyStrings") ? RuleFieldUri.EXCEPTION_CONTAINS_BODY_STRINGS : (s.equals("Exception:ContainsHeaderStrings") ? RuleFieldUri.EXCEPTION_CONTAINS_HEADER_STRINGS : (s.equals("Exception:ContainsRecipientStrings") ? RuleFieldUri.EXCEPTION_CONTAINS_RECIPIENT_STRINGS : (s.equals("Exception:ContainsSenderStrings") ? RuleFieldUri.EXCEPTION_CONTAINS_SENDER_STRINGS : (s.equals("Exception:ContainsSubjectOrBodyStrings") ? RuleFieldUri.EXCEPTION_CONTAINS_SUBJECT_OR_BODY_STRINGS : (s.equals("Exception:ContainsSubjectStrings") ? RuleFieldUri.EXCEPTION_CONTAINS_SUBJECT_STRINGS : (s.equals("Exception:FlaggedForAction") ? RuleFieldUri.EXCEPTION_FLAGGED_FOR_ACTION : (s.equals("Exception:FromAddresses") ? RuleFieldUri.EXCEPTION_FROM_ADDRESSES : (s.equals("Exception:FromConnectedAccounts") ? RuleFieldUri.EXCEPTION_FROM_CONNECTED_ACCOUNTS : (s.equals("Exception:HasAttachments") ? RuleFieldUri.EXCEPTION_HAS_ATTACHMENTS : (s.equals("Exception:Importance") ? RuleFieldUri.EXCEPTION_IMPORTANCE : (s.equals("Exception:IsApprovalRequest") ? RuleFieldUri.EXCEPTION_IS_APPROVAL_REQUEST : (s.equals("Exception:IsAutomaticForward") ? RuleFieldUri.EXCEPTION_IS_AUTOMATIC_FORWARD : (s.equals("Exception:IsAutomaticReply") ? RuleFieldUri.EXCEPTION_IS_AUTOMATIC_REPLY : (s.equals("Exception:IsEncrypted") ? RuleFieldUri.EXCEPTION_IS_ENCRYPTED : (s.equals("Exception:IsMeetingRequest") ? RuleFieldUri.EXCEPTION_IS_MEETING_REQUEST : (s.equals("Exception:IsMeetingResponse") ? RuleFieldUri.EXCEPTION_IS_MEETING_RESPONSE : (s.equals("Exception:IsNDR") ? RuleFieldUri.EXCEPTION_IS_NDR : (s.equals("Exception:IsPermissionControlled") ? RuleFieldUri.EXCEPTION_IS_PERMISSION_CONTROLLED : (s.equals("Exception:IsReadReceipt") ? RuleFieldUri.EXCEPTION_IS_READ_RECEIPT : (s.equals("Exception:IsSigned") ? RuleFieldUri.EXCEPTION_IS_SIGNED : (s.equals("Exception:IsVoicemail") ? RuleFieldUri.EXCEPTION_IS_VOICE_MAIL : (s.equals("Exception:ItemClasses") ? RuleFieldUri.EXCEPTION_ITEM_CLASSES : (s.equals("Exception:MessageClassifications") ? RuleFieldUri.EXCEPTION_MESSAGE_CLASSIFICATIONS : (s.equals("Exception:NotSentToMe") ? RuleFieldUri.EXCEPTION_NOT_SENT_TO_ME : (s.equals("Exception:SentCcMe") ? RuleFieldUri.EXCEPTION_SENT_CC_ME : (s.equals("Exception:SentOnlyToMe") ? RuleFieldUri.EXCEPTION_SENT_ONLY_TO_ME : (s.equals("Exception:SentToAddresses") ? RuleFieldUri.EXCEPTION_SENT_TO_ADDRESSES : (s.equals("Exception:SentToMe") ? RuleFieldUri.EXCEPTION_SENT_TO_ME : (s.equals("Exception:SentToOrCcMe") ? RuleFieldUri.EXCEPTION_SENT_TO_OR_CC_ME : (s.equals("Exception:Sensitivity") ? RuleFieldUri.EXCEPTION_SENSITIVITY : (s.equals("Exception:WithinDateRange") ? RuleFieldUri.EXCEPTION_WITHIN_DATE_RANGE : (s.equals("Exception:WithinSizeRange") ? RuleFieldUri.EXCEPTION_WITHIN_SIZE_RANGE : (s.equals("Action:AssignCategories") ? RuleFieldUri.ACTION_ASSIGN_CATEGORIES : (s.equals("Action:CopyToFolder") ? RuleFieldUri.ACTION_COPY_TO_FOLDER : (s.equals("Action:Delete") ? RuleFieldUri.ACTION_DELETE : (s.equals("Action:ForwardAsAttachmentToRecipients") ? RuleFieldUri.ACTION_FORWARD_AS_ATTACHMENT_TO_RECIPIENTS : (s.equals("Action:ForwardToRecipients") ? RuleFieldUri.ACTION_FORWARD_TO_RECIPIENTS : (s.equals("Action:MarkImportance") ? RuleFieldUri.ACTION_MARK_IMPORTANCE : (s.equals("Action:MarkAsRead") ? RuleFieldUri.ACTION_MARK_AS_READ : (s.equals("Action:MoveToFolder") ? RuleFieldUri.ACTION_MOVE_TO_FOLDER : (s.equals("Action:PermanentDelete") ? RuleFieldUri.ACTION_PERMANENT_DELETE : (s.equals("Action:RedirectToRecipients") ? RuleFieldUri.ACTION_REDIRECT_TO_RECIPIENTS : (s.equals("Action:SendSMSAlertToRecipients") ? RuleFieldUri.ACTION_SEND_SMS_ALERT_TO_RECIPIENTS : (s.equals("Action:ServerReplyWithMessage") ? RuleFieldUri.ACTION_SERVER_REPLY_WITH_MESSAGE : (s.equals("Action:StopProcessingRules") ? RuleFieldUri.ACTION_STOP_PROCESSING_RULES : (s.equals("IsEnabled") ? RuleFieldUri.IS_ENABLED : (s.equals("IsInError") ? RuleFieldUri.IS_IN_ERROR : (s.equals("Conditions") ? RuleFieldUri.CONDITIONS : RuleFieldUri.EXCEPTIONS)))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))));
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ErrorCode") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                final String elementText2;
                if ((elementText2 = xmlStreamReader.getElementText()) != null && elementText2.length() > 0) {
                    final String s2;
                    this.b = ((s2 = elementText2).equals("ADOperationFailure") ? RuleValidationErrorCode.AD_OPERATION_FAILURE : (s2.equals("ConnectedAccountNotFound") ? RuleValidationErrorCode.CONNECTED_ACCOUNT_NOT_FOUND : (s2.equals("CreateWithRuleId") ? RuleValidationErrorCode.CREATE_WITH_RULE_ID : (s2.equals("EmptyValueFound") ? RuleValidationErrorCode.EMPTY_VALUE_FOUND : (s2.equals("DuplicatedPriority") ? RuleValidationErrorCode.DUPLICATED_PRIORITY : (s2.equals("DuplicatedOperationOnTheSameRule") ? RuleValidationErrorCode.DUPLICATED_OPERATION_ON_THE_SAME_RULE : (s2.equals("FolderDoesNotExist") ? RuleValidationErrorCode.FOLDER_DOES_NOT_EXIST : (s2.equals("InvalidAddress") ? RuleValidationErrorCode.INVALID_ADDRESS : (s2.equals("InvalidDateRange") ? RuleValidationErrorCode.INVALID_DATE_RANGE : (s2.equals("InvalidFolderId") ? RuleValidationErrorCode.INVALID_FOLDER_ID : (s2.equals("InvalidSizeRange") ? RuleValidationErrorCode.INVALID_SIZE_RANGE : (s2.equals("InvalidValue") ? RuleValidationErrorCode.INVALID_VALUE : (s2.equals("MessageClassificationNotFound") ? RuleValidationErrorCode.MESSAGE_CLASSIFICATION_NOT_FOUND : (s2.equals("MissingAction") ? RuleValidationErrorCode.MISSING_ACTION : (s2.equals("MissingParameter") ? RuleValidationErrorCode.MISSING_PARAMETER : (s2.equals("MissingRangeValue") ? RuleValidationErrorCode.MISSING_RANGE_VALUE : (s2.equals("NotSettable") ? RuleValidationErrorCode.NOT_SETTABLE : (s2.equals("RecipientDoesNotExist") ? RuleValidationErrorCode.RECIPIENT_DOES_NOT_EXIST : (s2.equals("RuleNotFound") ? RuleValidationErrorCode.RULE_NOT_FOUND : (s2.equals("SizeLessThanZero") ? RuleValidationErrorCode.SIZE_LESS_THEN_ZERO : (s2.equals("StringValueTooBig") ? RuleValidationErrorCode.STRING_VALUE_TOO_BIG : (s2.equals("UnsupportedAddress") ? RuleValidationErrorCode.UNSUPPORTED_ADDRESS : (s2.equals("UnexpectedError") ? RuleValidationErrorCode.UNEXPECTED_ERROR : RuleValidationErrorCode.UNSUPPORTED_RULE)))))))))))))))))))))));
                }
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("ErrorMessage") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.c = xmlStreamReader.getElementText();
            }
            else if (xmlStreamReader.isStartElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("FieldValue") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                this.d = xmlStreamReader.getElementText();
            }
            if (xmlStreamReader.isEndElement() && xmlStreamReader.getLocalName() != null && xmlStreamReader.getNamespaceURI() != null && xmlStreamReader.getLocalName().equals("Error") && xmlStreamReader.getNamespaceURI().equals("http://schemas.microsoft.com/exchange/services/2006/types")) {
                break;
            }
            xmlStreamReader.next();
        }
    }
    
    public RuleFieldUri getFieldUri() {
        return this.a;
    }
    
    public RuleValidationErrorCode getErrorCode() {
        return this.b;
    }
    
    public String getErrorMessage() {
        return this.c;
    }
    
    public String getFieldValue() {
        return this.d;
    }
}
