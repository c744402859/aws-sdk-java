/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.lexruntimev2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex.v2-2020-08-07/RecognizeText" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecognizeTextResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of messages last sent to the user. The messages are ordered based on the order that you returned the
     * messages from your Lambda function or the order that the messages are defined in the bot.
     * </p>
     */
    private java.util.List<Message> messages;
    /**
     * <p>
     * Represents the current state of the dialog between the user and the bot.
     * </p>
     * <p>
     * Use this to determine the progress of the conversation and what the next action may be.
     * </p>
     */
    private SessionState sessionState;
    /**
     * <p>
     * A list of intents that Amazon Lex determined might satisfy the user's utterance.
     * </p>
     * <p>
     * Each interpretation includes the intent, a score that indicates now confident Amazon Lex is that the
     * interpretation is the correct one, and an optional sentiment response that indicates the sentiment expressed in
     * the utterance.
     * </p>
     */
    private java.util.List<Interpretation> interpretations;
    /**
     * <p>
     * The attributes sent in the request.
     * </p>
     */
    private java.util.Map<String, String> requestAttributes;
    /**
     * <p>
     * The identifier of the session in use.
     * </p>
     */
    private String sessionId;

    /**
     * <p>
     * A list of messages last sent to the user. The messages are ordered based on the order that you returned the
     * messages from your Lambda function or the order that the messages are defined in the bot.
     * </p>
     * 
     * @return A list of messages last sent to the user. The messages are ordered based on the order that you returned
     *         the messages from your Lambda function or the order that the messages are defined in the bot.
     */

    public java.util.List<Message> getMessages() {
        return messages;
    }

    /**
     * <p>
     * A list of messages last sent to the user. The messages are ordered based on the order that you returned the
     * messages from your Lambda function or the order that the messages are defined in the bot.
     * </p>
     * 
     * @param messages
     *        A list of messages last sent to the user. The messages are ordered based on the order that you returned
     *        the messages from your Lambda function or the order that the messages are defined in the bot.
     */

    public void setMessages(java.util.Collection<Message> messages) {
        if (messages == null) {
            this.messages = null;
            return;
        }

        this.messages = new java.util.ArrayList<Message>(messages);
    }

    /**
     * <p>
     * A list of messages last sent to the user. The messages are ordered based on the order that you returned the
     * messages from your Lambda function or the order that the messages are defined in the bot.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMessages(java.util.Collection)} or {@link #withMessages(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param messages
     *        A list of messages last sent to the user. The messages are ordered based on the order that you returned
     *        the messages from your Lambda function or the order that the messages are defined in the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecognizeTextResult withMessages(Message... messages) {
        if (this.messages == null) {
            setMessages(new java.util.ArrayList<Message>(messages.length));
        }
        for (Message ele : messages) {
            this.messages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of messages last sent to the user. The messages are ordered based on the order that you returned the
     * messages from your Lambda function or the order that the messages are defined in the bot.
     * </p>
     * 
     * @param messages
     *        A list of messages last sent to the user. The messages are ordered based on the order that you returned
     *        the messages from your Lambda function or the order that the messages are defined in the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecognizeTextResult withMessages(java.util.Collection<Message> messages) {
        setMessages(messages);
        return this;
    }

    /**
     * <p>
     * Represents the current state of the dialog between the user and the bot.
     * </p>
     * <p>
     * Use this to determine the progress of the conversation and what the next action may be.
     * </p>
     * 
     * @param sessionState
     *        Represents the current state of the dialog between the user and the bot. </p>
     *        <p>
     *        Use this to determine the progress of the conversation and what the next action may be.
     */

    public void setSessionState(SessionState sessionState) {
        this.sessionState = sessionState;
    }

    /**
     * <p>
     * Represents the current state of the dialog between the user and the bot.
     * </p>
     * <p>
     * Use this to determine the progress of the conversation and what the next action may be.
     * </p>
     * 
     * @return Represents the current state of the dialog between the user and the bot. </p>
     *         <p>
     *         Use this to determine the progress of the conversation and what the next action may be.
     */

    public SessionState getSessionState() {
        return this.sessionState;
    }

    /**
     * <p>
     * Represents the current state of the dialog between the user and the bot.
     * </p>
     * <p>
     * Use this to determine the progress of the conversation and what the next action may be.
     * </p>
     * 
     * @param sessionState
     *        Represents the current state of the dialog between the user and the bot. </p>
     *        <p>
     *        Use this to determine the progress of the conversation and what the next action may be.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecognizeTextResult withSessionState(SessionState sessionState) {
        setSessionState(sessionState);
        return this;
    }

    /**
     * <p>
     * A list of intents that Amazon Lex determined might satisfy the user's utterance.
     * </p>
     * <p>
     * Each interpretation includes the intent, a score that indicates now confident Amazon Lex is that the
     * interpretation is the correct one, and an optional sentiment response that indicates the sentiment expressed in
     * the utterance.
     * </p>
     * 
     * @return A list of intents that Amazon Lex determined might satisfy the user's utterance. </p>
     *         <p>
     *         Each interpretation includes the intent, a score that indicates now confident Amazon Lex is that the
     *         interpretation is the correct one, and an optional sentiment response that indicates the sentiment
     *         expressed in the utterance.
     */

    public java.util.List<Interpretation> getInterpretations() {
        return interpretations;
    }

    /**
     * <p>
     * A list of intents that Amazon Lex determined might satisfy the user's utterance.
     * </p>
     * <p>
     * Each interpretation includes the intent, a score that indicates now confident Amazon Lex is that the
     * interpretation is the correct one, and an optional sentiment response that indicates the sentiment expressed in
     * the utterance.
     * </p>
     * 
     * @param interpretations
     *        A list of intents that Amazon Lex determined might satisfy the user's utterance. </p>
     *        <p>
     *        Each interpretation includes the intent, a score that indicates now confident Amazon Lex is that the
     *        interpretation is the correct one, and an optional sentiment response that indicates the sentiment
     *        expressed in the utterance.
     */

    public void setInterpretations(java.util.Collection<Interpretation> interpretations) {
        if (interpretations == null) {
            this.interpretations = null;
            return;
        }

        this.interpretations = new java.util.ArrayList<Interpretation>(interpretations);
    }

    /**
     * <p>
     * A list of intents that Amazon Lex determined might satisfy the user's utterance.
     * </p>
     * <p>
     * Each interpretation includes the intent, a score that indicates now confident Amazon Lex is that the
     * interpretation is the correct one, and an optional sentiment response that indicates the sentiment expressed in
     * the utterance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInterpretations(java.util.Collection)} or {@link #withInterpretations(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param interpretations
     *        A list of intents that Amazon Lex determined might satisfy the user's utterance. </p>
     *        <p>
     *        Each interpretation includes the intent, a score that indicates now confident Amazon Lex is that the
     *        interpretation is the correct one, and an optional sentiment response that indicates the sentiment
     *        expressed in the utterance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecognizeTextResult withInterpretations(Interpretation... interpretations) {
        if (this.interpretations == null) {
            setInterpretations(new java.util.ArrayList<Interpretation>(interpretations.length));
        }
        for (Interpretation ele : interpretations) {
            this.interpretations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of intents that Amazon Lex determined might satisfy the user's utterance.
     * </p>
     * <p>
     * Each interpretation includes the intent, a score that indicates now confident Amazon Lex is that the
     * interpretation is the correct one, and an optional sentiment response that indicates the sentiment expressed in
     * the utterance.
     * </p>
     * 
     * @param interpretations
     *        A list of intents that Amazon Lex determined might satisfy the user's utterance. </p>
     *        <p>
     *        Each interpretation includes the intent, a score that indicates now confident Amazon Lex is that the
     *        interpretation is the correct one, and an optional sentiment response that indicates the sentiment
     *        expressed in the utterance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecognizeTextResult withInterpretations(java.util.Collection<Interpretation> interpretations) {
        setInterpretations(interpretations);
        return this;
    }

    /**
     * <p>
     * The attributes sent in the request.
     * </p>
     * 
     * @return The attributes sent in the request.
     */

    public java.util.Map<String, String> getRequestAttributes() {
        return requestAttributes;
    }

    /**
     * <p>
     * The attributes sent in the request.
     * </p>
     * 
     * @param requestAttributes
     *        The attributes sent in the request.
     */

    public void setRequestAttributes(java.util.Map<String, String> requestAttributes) {
        this.requestAttributes = requestAttributes;
    }

    /**
     * <p>
     * The attributes sent in the request.
     * </p>
     * 
     * @param requestAttributes
     *        The attributes sent in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecognizeTextResult withRequestAttributes(java.util.Map<String, String> requestAttributes) {
        setRequestAttributes(requestAttributes);
        return this;
    }

    /**
     * Add a single RequestAttributes entry
     *
     * @see RecognizeTextResult#withRequestAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public RecognizeTextResult addRequestAttributesEntry(String key, String value) {
        if (null == this.requestAttributes) {
            this.requestAttributes = new java.util.HashMap<String, String>();
        }
        if (this.requestAttributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.requestAttributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RequestAttributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecognizeTextResult clearRequestAttributesEntries() {
        this.requestAttributes = null;
        return this;
    }

    /**
     * <p>
     * The identifier of the session in use.
     * </p>
     * 
     * @param sessionId
     *        The identifier of the session in use.
     */

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * <p>
     * The identifier of the session in use.
     * </p>
     * 
     * @return The identifier of the session in use.
     */

    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * <p>
     * The identifier of the session in use.
     * </p>
     * 
     * @param sessionId
     *        The identifier of the session in use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecognizeTextResult withSessionId(String sessionId) {
        setSessionId(sessionId);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMessages() != null)
            sb.append("Messages: ").append(getMessages()).append(",");
        if (getSessionState() != null)
            sb.append("SessionState: ").append(getSessionState()).append(",");
        if (getInterpretations() != null)
            sb.append("Interpretations: ").append(getInterpretations()).append(",");
        if (getRequestAttributes() != null)
            sb.append("RequestAttributes: ").append(getRequestAttributes()).append(",");
        if (getSessionId() != null)
            sb.append("SessionId: ").append(getSessionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecognizeTextResult == false)
            return false;
        RecognizeTextResult other = (RecognizeTextResult) obj;
        if (other.getMessages() == null ^ this.getMessages() == null)
            return false;
        if (other.getMessages() != null && other.getMessages().equals(this.getMessages()) == false)
            return false;
        if (other.getSessionState() == null ^ this.getSessionState() == null)
            return false;
        if (other.getSessionState() != null && other.getSessionState().equals(this.getSessionState()) == false)
            return false;
        if (other.getInterpretations() == null ^ this.getInterpretations() == null)
            return false;
        if (other.getInterpretations() != null && other.getInterpretations().equals(this.getInterpretations()) == false)
            return false;
        if (other.getRequestAttributes() == null ^ this.getRequestAttributes() == null)
            return false;
        if (other.getRequestAttributes() != null && other.getRequestAttributes().equals(this.getRequestAttributes()) == false)
            return false;
        if (other.getSessionId() == null ^ this.getSessionId() == null)
            return false;
        if (other.getSessionId() != null && other.getSessionId().equals(this.getSessionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessages() == null) ? 0 : getMessages().hashCode());
        hashCode = prime * hashCode + ((getSessionState() == null) ? 0 : getSessionState().hashCode());
        hashCode = prime * hashCode + ((getInterpretations() == null) ? 0 : getInterpretations().hashCode());
        hashCode = prime * hashCode + ((getRequestAttributes() == null) ? 0 : getRequestAttributes().hashCode());
        hashCode = prime * hashCode + ((getSessionId() == null) ? 0 : getSessionId().hashCode());
        return hashCode;
    }

    @Override
    public RecognizeTextResult clone() {
        try {
            return (RecognizeTextResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
