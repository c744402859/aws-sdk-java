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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/BuildBotLocale" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BuildBotLocaleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the bot to build. The identifier is returned in the response from the operation.
     * </p>
     */
    private String botId;
    /**
     * <p>
     * The version of the bot to build. This can only be the draft version of the bot.
     * </p>
     */
    private String botVersion;
    /**
     * <p>
     * The identifier of the language and locale that the bot will be used in. The string must match one of the
     * supported locales. All of the intents, slot types, and slots used in the bot must have the same locale. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/lex/latest/dg/supported-locales.html">https://docs.aws.amazon
     * .com/lex/latest/dg/supported-locales.html</a>.
     * </p>
     */
    private String localeId;

    /**
     * <p>
     * The identifier of the bot to build. The identifier is returned in the response from the operation.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot to build. The identifier is returned in the response from the operation.
     */

    public void setBotId(String botId) {
        this.botId = botId;
    }

    /**
     * <p>
     * The identifier of the bot to build. The identifier is returned in the response from the operation.
     * </p>
     * 
     * @return The identifier of the bot to build. The identifier is returned in the response from the operation.
     */

    public String getBotId() {
        return this.botId;
    }

    /**
     * <p>
     * The identifier of the bot to build. The identifier is returned in the response from the operation.
     * </p>
     * 
     * @param botId
     *        The identifier of the bot to build. The identifier is returned in the response from the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildBotLocaleRequest withBotId(String botId) {
        setBotId(botId);
        return this;
    }

    /**
     * <p>
     * The version of the bot to build. This can only be the draft version of the bot.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot to build. This can only be the draft version of the bot.
     */

    public void setBotVersion(String botVersion) {
        this.botVersion = botVersion;
    }

    /**
     * <p>
     * The version of the bot to build. This can only be the draft version of the bot.
     * </p>
     * 
     * @return The version of the bot to build. This can only be the draft version of the bot.
     */

    public String getBotVersion() {
        return this.botVersion;
    }

    /**
     * <p>
     * The version of the bot to build. This can only be the draft version of the bot.
     * </p>
     * 
     * @param botVersion
     *        The version of the bot to build. This can only be the draft version of the bot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildBotLocaleRequest withBotVersion(String botVersion) {
        setBotVersion(botVersion);
        return this;
    }

    /**
     * <p>
     * The identifier of the language and locale that the bot will be used in. The string must match one of the
     * supported locales. All of the intents, slot types, and slots used in the bot must have the same locale. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/lex/latest/dg/supported-locales.html">https://docs.aws.amazon
     * .com/lex/latest/dg/supported-locales.html</a>.
     * </p>
     * 
     * @param localeId
     *        The identifier of the language and locale that the bot will be used in. The string must match one of the
     *        supported locales. All of the intents, slot types, and slots used in the bot must have the same locale.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/lex/latest/dg/supported-locales.html">https:
     *        //docs.aws.amazon.com/lex/latest/dg/supported-locales.html</a>.
     */

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    /**
     * <p>
     * The identifier of the language and locale that the bot will be used in. The string must match one of the
     * supported locales. All of the intents, slot types, and slots used in the bot must have the same locale. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/lex/latest/dg/supported-locales.html">https://docs.aws.amazon
     * .com/lex/latest/dg/supported-locales.html</a>.
     * </p>
     * 
     * @return The identifier of the language and locale that the bot will be used in. The string must match one of the
     *         supported locales. All of the intents, slot types, and slots used in the bot must have the same locale.
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/lex/latest/dg/supported-locales.html">https
     *         ://docs.aws.amazon.com/lex/latest/dg/supported-locales.html</a>.
     */

    public String getLocaleId() {
        return this.localeId;
    }

    /**
     * <p>
     * The identifier of the language and locale that the bot will be used in. The string must match one of the
     * supported locales. All of the intents, slot types, and slots used in the bot must have the same locale. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/lex/latest/dg/supported-locales.html">https://docs.aws.amazon
     * .com/lex/latest/dg/supported-locales.html</a>.
     * </p>
     * 
     * @param localeId
     *        The identifier of the language and locale that the bot will be used in. The string must match one of the
     *        supported locales. All of the intents, slot types, and slots used in the bot must have the same locale.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/lex/latest/dg/supported-locales.html">https:
     *        //docs.aws.amazon.com/lex/latest/dg/supported-locales.html</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildBotLocaleRequest withLocaleId(String localeId) {
        setLocaleId(localeId);
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
        if (getBotId() != null)
            sb.append("BotId: ").append(getBotId()).append(",");
        if (getBotVersion() != null)
            sb.append("BotVersion: ").append(getBotVersion()).append(",");
        if (getLocaleId() != null)
            sb.append("LocaleId: ").append(getLocaleId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BuildBotLocaleRequest == false)
            return false;
        BuildBotLocaleRequest other = (BuildBotLocaleRequest) obj;
        if (other.getBotId() == null ^ this.getBotId() == null)
            return false;
        if (other.getBotId() != null && other.getBotId().equals(this.getBotId()) == false)
            return false;
        if (other.getBotVersion() == null ^ this.getBotVersion() == null)
            return false;
        if (other.getBotVersion() != null && other.getBotVersion().equals(this.getBotVersion()) == false)
            return false;
        if (other.getLocaleId() == null ^ this.getLocaleId() == null)
            return false;
        if (other.getLocaleId() != null && other.getLocaleId().equals(this.getLocaleId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBotId() == null) ? 0 : getBotId().hashCode());
        hashCode = prime * hashCode + ((getBotVersion() == null) ? 0 : getBotVersion().hashCode());
        hashCode = prime * hashCode + ((getLocaleId() == null) ? 0 : getLocaleId().hashCode());
        return hashCode;
    }

    @Override
    public BuildBotLocaleRequest clone() {
        return (BuildBotLocaleRequest) super.clone();
    }

}
