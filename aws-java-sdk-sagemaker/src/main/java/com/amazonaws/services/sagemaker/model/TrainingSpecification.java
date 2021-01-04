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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines how the algorithm is used for a training job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/TrainingSpecification" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrainingSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon ECR registry path of the Docker image that contains the training algorithm.
     * </p>
     */
    private String trainingImage;
    /**
     * <p>
     * An MD5 hash of the training algorithm that identifies the Docker image used for training.
     * </p>
     */
    private String trainingImageDigest;
    /**
     * <p>
     * A list of the <code>HyperParameterSpecification</code> objects, that define the supported hyperparameters. This
     * is required if the algorithm supports automatic model tuning.&gt;
     * </p>
     */
    private java.util.List<HyperParameterSpecification> supportedHyperParameters;
    /**
     * <p>
     * A list of the instance types that this algorithm can use for training.
     * </p>
     */
    private java.util.List<String> supportedTrainingInstanceTypes;
    /**
     * <p>
     * Indicates whether the algorithm supports distributed training. If set to false, buyers can't request more than
     * one instance during training.
     * </p>
     */
    private Boolean supportsDistributedTraining;
    /**
     * <p>
     * A list of <code>MetricDefinition</code> objects, which are used for parsing metrics generated by the algorithm.
     * </p>
     */
    private java.util.List<MetricDefinition> metricDefinitions;
    /**
     * <p>
     * A list of <code>ChannelSpecification</code> objects, which specify the input sources to be used by the algorithm.
     * </p>
     */
    private java.util.List<ChannelSpecification> trainingChannels;
    /**
     * <p>
     * A list of the metrics that the algorithm emits that can be used as the objective metric in a hyperparameter
     * tuning job.
     * </p>
     */
    private java.util.List<HyperParameterTuningJobObjective> supportedTuningJobObjectiveMetrics;

    /**
     * <p>
     * The Amazon ECR registry path of the Docker image that contains the training algorithm.
     * </p>
     * 
     * @param trainingImage
     *        The Amazon ECR registry path of the Docker image that contains the training algorithm.
     */

    public void setTrainingImage(String trainingImage) {
        this.trainingImage = trainingImage;
    }

    /**
     * <p>
     * The Amazon ECR registry path of the Docker image that contains the training algorithm.
     * </p>
     * 
     * @return The Amazon ECR registry path of the Docker image that contains the training algorithm.
     */

    public String getTrainingImage() {
        return this.trainingImage;
    }

    /**
     * <p>
     * The Amazon ECR registry path of the Docker image that contains the training algorithm.
     * </p>
     * 
     * @param trainingImage
     *        The Amazon ECR registry path of the Docker image that contains the training algorithm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingSpecification withTrainingImage(String trainingImage) {
        setTrainingImage(trainingImage);
        return this;
    }

    /**
     * <p>
     * An MD5 hash of the training algorithm that identifies the Docker image used for training.
     * </p>
     * 
     * @param trainingImageDigest
     *        An MD5 hash of the training algorithm that identifies the Docker image used for training.
     */

    public void setTrainingImageDigest(String trainingImageDigest) {
        this.trainingImageDigest = trainingImageDigest;
    }

    /**
     * <p>
     * An MD5 hash of the training algorithm that identifies the Docker image used for training.
     * </p>
     * 
     * @return An MD5 hash of the training algorithm that identifies the Docker image used for training.
     */

    public String getTrainingImageDigest() {
        return this.trainingImageDigest;
    }

    /**
     * <p>
     * An MD5 hash of the training algorithm that identifies the Docker image used for training.
     * </p>
     * 
     * @param trainingImageDigest
     *        An MD5 hash of the training algorithm that identifies the Docker image used for training.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingSpecification withTrainingImageDigest(String trainingImageDigest) {
        setTrainingImageDigest(trainingImageDigest);
        return this;
    }

    /**
     * <p>
     * A list of the <code>HyperParameterSpecification</code> objects, that define the supported hyperparameters. This
     * is required if the algorithm supports automatic model tuning.&gt;
     * </p>
     * 
     * @return A list of the <code>HyperParameterSpecification</code> objects, that define the supported
     *         hyperparameters. This is required if the algorithm supports automatic model tuning.&gt;
     */

    public java.util.List<HyperParameterSpecification> getSupportedHyperParameters() {
        return supportedHyperParameters;
    }

    /**
     * <p>
     * A list of the <code>HyperParameterSpecification</code> objects, that define the supported hyperparameters. This
     * is required if the algorithm supports automatic model tuning.&gt;
     * </p>
     * 
     * @param supportedHyperParameters
     *        A list of the <code>HyperParameterSpecification</code> objects, that define the supported hyperparameters.
     *        This is required if the algorithm supports automatic model tuning.&gt;
     */

    public void setSupportedHyperParameters(java.util.Collection<HyperParameterSpecification> supportedHyperParameters) {
        if (supportedHyperParameters == null) {
            this.supportedHyperParameters = null;
            return;
        }

        this.supportedHyperParameters = new java.util.ArrayList<HyperParameterSpecification>(supportedHyperParameters);
    }

    /**
     * <p>
     * A list of the <code>HyperParameterSpecification</code> objects, that define the supported hyperparameters. This
     * is required if the algorithm supports automatic model tuning.&gt;
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedHyperParameters(java.util.Collection)} or
     * {@link #withSupportedHyperParameters(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param supportedHyperParameters
     *        A list of the <code>HyperParameterSpecification</code> objects, that define the supported hyperparameters.
     *        This is required if the algorithm supports automatic model tuning.&gt;
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingSpecification withSupportedHyperParameters(HyperParameterSpecification... supportedHyperParameters) {
        if (this.supportedHyperParameters == null) {
            setSupportedHyperParameters(new java.util.ArrayList<HyperParameterSpecification>(supportedHyperParameters.length));
        }
        for (HyperParameterSpecification ele : supportedHyperParameters) {
            this.supportedHyperParameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the <code>HyperParameterSpecification</code> objects, that define the supported hyperparameters. This
     * is required if the algorithm supports automatic model tuning.&gt;
     * </p>
     * 
     * @param supportedHyperParameters
     *        A list of the <code>HyperParameterSpecification</code> objects, that define the supported hyperparameters.
     *        This is required if the algorithm supports automatic model tuning.&gt;
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingSpecification withSupportedHyperParameters(java.util.Collection<HyperParameterSpecification> supportedHyperParameters) {
        setSupportedHyperParameters(supportedHyperParameters);
        return this;
    }

    /**
     * <p>
     * A list of the instance types that this algorithm can use for training.
     * </p>
     * 
     * @return A list of the instance types that this algorithm can use for training.
     * @see TrainingInstanceType
     */

    public java.util.List<String> getSupportedTrainingInstanceTypes() {
        return supportedTrainingInstanceTypes;
    }

    /**
     * <p>
     * A list of the instance types that this algorithm can use for training.
     * </p>
     * 
     * @param supportedTrainingInstanceTypes
     *        A list of the instance types that this algorithm can use for training.
     * @see TrainingInstanceType
     */

    public void setSupportedTrainingInstanceTypes(java.util.Collection<String> supportedTrainingInstanceTypes) {
        if (supportedTrainingInstanceTypes == null) {
            this.supportedTrainingInstanceTypes = null;
            return;
        }

        this.supportedTrainingInstanceTypes = new java.util.ArrayList<String>(supportedTrainingInstanceTypes);
    }

    /**
     * <p>
     * A list of the instance types that this algorithm can use for training.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedTrainingInstanceTypes(java.util.Collection)} or
     * {@link #withSupportedTrainingInstanceTypes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param supportedTrainingInstanceTypes
     *        A list of the instance types that this algorithm can use for training.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrainingInstanceType
     */

    public TrainingSpecification withSupportedTrainingInstanceTypes(String... supportedTrainingInstanceTypes) {
        if (this.supportedTrainingInstanceTypes == null) {
            setSupportedTrainingInstanceTypes(new java.util.ArrayList<String>(supportedTrainingInstanceTypes.length));
        }
        for (String ele : supportedTrainingInstanceTypes) {
            this.supportedTrainingInstanceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the instance types that this algorithm can use for training.
     * </p>
     * 
     * @param supportedTrainingInstanceTypes
     *        A list of the instance types that this algorithm can use for training.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrainingInstanceType
     */

    public TrainingSpecification withSupportedTrainingInstanceTypes(java.util.Collection<String> supportedTrainingInstanceTypes) {
        setSupportedTrainingInstanceTypes(supportedTrainingInstanceTypes);
        return this;
    }

    /**
     * <p>
     * A list of the instance types that this algorithm can use for training.
     * </p>
     * 
     * @param supportedTrainingInstanceTypes
     *        A list of the instance types that this algorithm can use for training.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrainingInstanceType
     */

    public TrainingSpecification withSupportedTrainingInstanceTypes(TrainingInstanceType... supportedTrainingInstanceTypes) {
        java.util.ArrayList<String> supportedTrainingInstanceTypesCopy = new java.util.ArrayList<String>(supportedTrainingInstanceTypes.length);
        for (TrainingInstanceType value : supportedTrainingInstanceTypes) {
            supportedTrainingInstanceTypesCopy.add(value.toString());
        }
        if (getSupportedTrainingInstanceTypes() == null) {
            setSupportedTrainingInstanceTypes(supportedTrainingInstanceTypesCopy);
        } else {
            getSupportedTrainingInstanceTypes().addAll(supportedTrainingInstanceTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * Indicates whether the algorithm supports distributed training. If set to false, buyers can't request more than
     * one instance during training.
     * </p>
     * 
     * @param supportsDistributedTraining
     *        Indicates whether the algorithm supports distributed training. If set to false, buyers can't request more
     *        than one instance during training.
     */

    public void setSupportsDistributedTraining(Boolean supportsDistributedTraining) {
        this.supportsDistributedTraining = supportsDistributedTraining;
    }

    /**
     * <p>
     * Indicates whether the algorithm supports distributed training. If set to false, buyers can't request more than
     * one instance during training.
     * </p>
     * 
     * @return Indicates whether the algorithm supports distributed training. If set to false, buyers can't request more
     *         than one instance during training.
     */

    public Boolean getSupportsDistributedTraining() {
        return this.supportsDistributedTraining;
    }

    /**
     * <p>
     * Indicates whether the algorithm supports distributed training. If set to false, buyers can't request more than
     * one instance during training.
     * </p>
     * 
     * @param supportsDistributedTraining
     *        Indicates whether the algorithm supports distributed training. If set to false, buyers can't request more
     *        than one instance during training.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingSpecification withSupportsDistributedTraining(Boolean supportsDistributedTraining) {
        setSupportsDistributedTraining(supportsDistributedTraining);
        return this;
    }

    /**
     * <p>
     * Indicates whether the algorithm supports distributed training. If set to false, buyers can't request more than
     * one instance during training.
     * </p>
     * 
     * @return Indicates whether the algorithm supports distributed training. If set to false, buyers can't request more
     *         than one instance during training.
     */

    public Boolean isSupportsDistributedTraining() {
        return this.supportsDistributedTraining;
    }

    /**
     * <p>
     * A list of <code>MetricDefinition</code> objects, which are used for parsing metrics generated by the algorithm.
     * </p>
     * 
     * @return A list of <code>MetricDefinition</code> objects, which are used for parsing metrics generated by the
     *         algorithm.
     */

    public java.util.List<MetricDefinition> getMetricDefinitions() {
        return metricDefinitions;
    }

    /**
     * <p>
     * A list of <code>MetricDefinition</code> objects, which are used for parsing metrics generated by the algorithm.
     * </p>
     * 
     * @param metricDefinitions
     *        A list of <code>MetricDefinition</code> objects, which are used for parsing metrics generated by the
     *        algorithm.
     */

    public void setMetricDefinitions(java.util.Collection<MetricDefinition> metricDefinitions) {
        if (metricDefinitions == null) {
            this.metricDefinitions = null;
            return;
        }

        this.metricDefinitions = new java.util.ArrayList<MetricDefinition>(metricDefinitions);
    }

    /**
     * <p>
     * A list of <code>MetricDefinition</code> objects, which are used for parsing metrics generated by the algorithm.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricDefinitions(java.util.Collection)} or {@link #withMetricDefinitions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param metricDefinitions
     *        A list of <code>MetricDefinition</code> objects, which are used for parsing metrics generated by the
     *        algorithm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingSpecification withMetricDefinitions(MetricDefinition... metricDefinitions) {
        if (this.metricDefinitions == null) {
            setMetricDefinitions(new java.util.ArrayList<MetricDefinition>(metricDefinitions.length));
        }
        for (MetricDefinition ele : metricDefinitions) {
            this.metricDefinitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>MetricDefinition</code> objects, which are used for parsing metrics generated by the algorithm.
     * </p>
     * 
     * @param metricDefinitions
     *        A list of <code>MetricDefinition</code> objects, which are used for parsing metrics generated by the
     *        algorithm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingSpecification withMetricDefinitions(java.util.Collection<MetricDefinition> metricDefinitions) {
        setMetricDefinitions(metricDefinitions);
        return this;
    }

    /**
     * <p>
     * A list of <code>ChannelSpecification</code> objects, which specify the input sources to be used by the algorithm.
     * </p>
     * 
     * @return A list of <code>ChannelSpecification</code> objects, which specify the input sources to be used by the
     *         algorithm.
     */

    public java.util.List<ChannelSpecification> getTrainingChannels() {
        return trainingChannels;
    }

    /**
     * <p>
     * A list of <code>ChannelSpecification</code> objects, which specify the input sources to be used by the algorithm.
     * </p>
     * 
     * @param trainingChannels
     *        A list of <code>ChannelSpecification</code> objects, which specify the input sources to be used by the
     *        algorithm.
     */

    public void setTrainingChannels(java.util.Collection<ChannelSpecification> trainingChannels) {
        if (trainingChannels == null) {
            this.trainingChannels = null;
            return;
        }

        this.trainingChannels = new java.util.ArrayList<ChannelSpecification>(trainingChannels);
    }

    /**
     * <p>
     * A list of <code>ChannelSpecification</code> objects, which specify the input sources to be used by the algorithm.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTrainingChannels(java.util.Collection)} or {@link #withTrainingChannels(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param trainingChannels
     *        A list of <code>ChannelSpecification</code> objects, which specify the input sources to be used by the
     *        algorithm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingSpecification withTrainingChannels(ChannelSpecification... trainingChannels) {
        if (this.trainingChannels == null) {
            setTrainingChannels(new java.util.ArrayList<ChannelSpecification>(trainingChannels.length));
        }
        for (ChannelSpecification ele : trainingChannels) {
            this.trainingChannels.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>ChannelSpecification</code> objects, which specify the input sources to be used by the algorithm.
     * </p>
     * 
     * @param trainingChannels
     *        A list of <code>ChannelSpecification</code> objects, which specify the input sources to be used by the
     *        algorithm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingSpecification withTrainingChannels(java.util.Collection<ChannelSpecification> trainingChannels) {
        setTrainingChannels(trainingChannels);
        return this;
    }

    /**
     * <p>
     * A list of the metrics that the algorithm emits that can be used as the objective metric in a hyperparameter
     * tuning job.
     * </p>
     * 
     * @return A list of the metrics that the algorithm emits that can be used as the objective metric in a
     *         hyperparameter tuning job.
     */

    public java.util.List<HyperParameterTuningJobObjective> getSupportedTuningJobObjectiveMetrics() {
        return supportedTuningJobObjectiveMetrics;
    }

    /**
     * <p>
     * A list of the metrics that the algorithm emits that can be used as the objective metric in a hyperparameter
     * tuning job.
     * </p>
     * 
     * @param supportedTuningJobObjectiveMetrics
     *        A list of the metrics that the algorithm emits that can be used as the objective metric in a
     *        hyperparameter tuning job.
     */

    public void setSupportedTuningJobObjectiveMetrics(java.util.Collection<HyperParameterTuningJobObjective> supportedTuningJobObjectiveMetrics) {
        if (supportedTuningJobObjectiveMetrics == null) {
            this.supportedTuningJobObjectiveMetrics = null;
            return;
        }

        this.supportedTuningJobObjectiveMetrics = new java.util.ArrayList<HyperParameterTuningJobObjective>(supportedTuningJobObjectiveMetrics);
    }

    /**
     * <p>
     * A list of the metrics that the algorithm emits that can be used as the objective metric in a hyperparameter
     * tuning job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedTuningJobObjectiveMetrics(java.util.Collection)} or
     * {@link #withSupportedTuningJobObjectiveMetrics(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param supportedTuningJobObjectiveMetrics
     *        A list of the metrics that the algorithm emits that can be used as the objective metric in a
     *        hyperparameter tuning job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingSpecification withSupportedTuningJobObjectiveMetrics(HyperParameterTuningJobObjective... supportedTuningJobObjectiveMetrics) {
        if (this.supportedTuningJobObjectiveMetrics == null) {
            setSupportedTuningJobObjectiveMetrics(new java.util.ArrayList<HyperParameterTuningJobObjective>(supportedTuningJobObjectiveMetrics.length));
        }
        for (HyperParameterTuningJobObjective ele : supportedTuningJobObjectiveMetrics) {
            this.supportedTuningJobObjectiveMetrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the metrics that the algorithm emits that can be used as the objective metric in a hyperparameter
     * tuning job.
     * </p>
     * 
     * @param supportedTuningJobObjectiveMetrics
     *        A list of the metrics that the algorithm emits that can be used as the objective metric in a
     *        hyperparameter tuning job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingSpecification withSupportedTuningJobObjectiveMetrics(
            java.util.Collection<HyperParameterTuningJobObjective> supportedTuningJobObjectiveMetrics) {
        setSupportedTuningJobObjectiveMetrics(supportedTuningJobObjectiveMetrics);
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
        if (getTrainingImage() != null)
            sb.append("TrainingImage: ").append(getTrainingImage()).append(",");
        if (getTrainingImageDigest() != null)
            sb.append("TrainingImageDigest: ").append(getTrainingImageDigest()).append(",");
        if (getSupportedHyperParameters() != null)
            sb.append("SupportedHyperParameters: ").append(getSupportedHyperParameters()).append(",");
        if (getSupportedTrainingInstanceTypes() != null)
            sb.append("SupportedTrainingInstanceTypes: ").append(getSupportedTrainingInstanceTypes()).append(",");
        if (getSupportsDistributedTraining() != null)
            sb.append("SupportsDistributedTraining: ").append(getSupportsDistributedTraining()).append(",");
        if (getMetricDefinitions() != null)
            sb.append("MetricDefinitions: ").append(getMetricDefinitions()).append(",");
        if (getTrainingChannels() != null)
            sb.append("TrainingChannels: ").append(getTrainingChannels()).append(",");
        if (getSupportedTuningJobObjectiveMetrics() != null)
            sb.append("SupportedTuningJobObjectiveMetrics: ").append(getSupportedTuningJobObjectiveMetrics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrainingSpecification == false)
            return false;
        TrainingSpecification other = (TrainingSpecification) obj;
        if (other.getTrainingImage() == null ^ this.getTrainingImage() == null)
            return false;
        if (other.getTrainingImage() != null && other.getTrainingImage().equals(this.getTrainingImage()) == false)
            return false;
        if (other.getTrainingImageDigest() == null ^ this.getTrainingImageDigest() == null)
            return false;
        if (other.getTrainingImageDigest() != null && other.getTrainingImageDigest().equals(this.getTrainingImageDigest()) == false)
            return false;
        if (other.getSupportedHyperParameters() == null ^ this.getSupportedHyperParameters() == null)
            return false;
        if (other.getSupportedHyperParameters() != null && other.getSupportedHyperParameters().equals(this.getSupportedHyperParameters()) == false)
            return false;
        if (other.getSupportedTrainingInstanceTypes() == null ^ this.getSupportedTrainingInstanceTypes() == null)
            return false;
        if (other.getSupportedTrainingInstanceTypes() != null
                && other.getSupportedTrainingInstanceTypes().equals(this.getSupportedTrainingInstanceTypes()) == false)
            return false;
        if (other.getSupportsDistributedTraining() == null ^ this.getSupportsDistributedTraining() == null)
            return false;
        if (other.getSupportsDistributedTraining() != null && other.getSupportsDistributedTraining().equals(this.getSupportsDistributedTraining()) == false)
            return false;
        if (other.getMetricDefinitions() == null ^ this.getMetricDefinitions() == null)
            return false;
        if (other.getMetricDefinitions() != null && other.getMetricDefinitions().equals(this.getMetricDefinitions()) == false)
            return false;
        if (other.getTrainingChannels() == null ^ this.getTrainingChannels() == null)
            return false;
        if (other.getTrainingChannels() != null && other.getTrainingChannels().equals(this.getTrainingChannels()) == false)
            return false;
        if (other.getSupportedTuningJobObjectiveMetrics() == null ^ this.getSupportedTuningJobObjectiveMetrics() == null)
            return false;
        if (other.getSupportedTuningJobObjectiveMetrics() != null
                && other.getSupportedTuningJobObjectiveMetrics().equals(this.getSupportedTuningJobObjectiveMetrics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrainingImage() == null) ? 0 : getTrainingImage().hashCode());
        hashCode = prime * hashCode + ((getTrainingImageDigest() == null) ? 0 : getTrainingImageDigest().hashCode());
        hashCode = prime * hashCode + ((getSupportedHyperParameters() == null) ? 0 : getSupportedHyperParameters().hashCode());
        hashCode = prime * hashCode + ((getSupportedTrainingInstanceTypes() == null) ? 0 : getSupportedTrainingInstanceTypes().hashCode());
        hashCode = prime * hashCode + ((getSupportsDistributedTraining() == null) ? 0 : getSupportsDistributedTraining().hashCode());
        hashCode = prime * hashCode + ((getMetricDefinitions() == null) ? 0 : getMetricDefinitions().hashCode());
        hashCode = prime * hashCode + ((getTrainingChannels() == null) ? 0 : getTrainingChannels().hashCode());
        hashCode = prime * hashCode + ((getSupportedTuningJobObjectiveMetrics() == null) ? 0 : getSupportedTuningJobObjectiveMetrics().hashCode());
        return hashCode;
    }

    @Override
    public TrainingSpecification clone() {
        try {
            return (TrainingSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.TrainingSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
