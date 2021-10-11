// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: exam.proto

package com.examApplication.stub.exam;

/**
 * <pre>
 * This is the request message where it takes an id to find data
 * </pre>
 *
 * Protobuf type {@code com.examApplication.stub.exam.ExamGRpcRequest}
 */
public final class ExamGRpcRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.examApplication.stub.exam.ExamGRpcRequest)
    ExamGRpcRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExamGRpcRequest.newBuilder() to construct.
  private ExamGRpcRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExamGRpcRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExamGRpcRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ExamGRpcRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            examId_ = input.readInt64();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.examApplication.stub.exam.Exam.internal_static_com_examApplication_stub_exam_ExamGRpcRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.examApplication.stub.exam.Exam.internal_static_com_examApplication_stub_exam_ExamGRpcRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.examApplication.stub.exam.ExamGRpcRequest.class, com.examApplication.stub.exam.ExamGRpcRequest.Builder.class);
  }

  public static final int EXAMID_FIELD_NUMBER = 1;
  private long examId_;
  /**
   * <code>int64 examId = 1;</code>
   * @return The examId.
   */
  @java.lang.Override
  public long getExamId() {
    return examId_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (examId_ != 0L) {
      output.writeInt64(1, examId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (examId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, examId_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.examApplication.stub.exam.ExamGRpcRequest)) {
      return super.equals(obj);
    }
    com.examApplication.stub.exam.ExamGRpcRequest other = (com.examApplication.stub.exam.ExamGRpcRequest) obj;

    if (getExamId()
        != other.getExamId()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + EXAMID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getExamId());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.examApplication.stub.exam.ExamGRpcRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.examApplication.stub.exam.ExamGRpcRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.examApplication.stub.exam.ExamGRpcRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.examApplication.stub.exam.ExamGRpcRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.examApplication.stub.exam.ExamGRpcRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.examApplication.stub.exam.ExamGRpcRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.examApplication.stub.exam.ExamGRpcRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.examApplication.stub.exam.ExamGRpcRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.examApplication.stub.exam.ExamGRpcRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.examApplication.stub.exam.ExamGRpcRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.examApplication.stub.exam.ExamGRpcRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.examApplication.stub.exam.ExamGRpcRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.examApplication.stub.exam.ExamGRpcRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * This is the request message where it takes an id to find data
   * </pre>
   *
   * Protobuf type {@code com.examApplication.stub.exam.ExamGRpcRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.examApplication.stub.exam.ExamGRpcRequest)
      com.examApplication.stub.exam.ExamGRpcRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.examApplication.stub.exam.Exam.internal_static_com_examApplication_stub_exam_ExamGRpcRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.examApplication.stub.exam.Exam.internal_static_com_examApplication_stub_exam_ExamGRpcRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.examApplication.stub.exam.ExamGRpcRequest.class, com.examApplication.stub.exam.ExamGRpcRequest.Builder.class);
    }

    // Construct using com.examApplication.stub.exam.ExamGRpcRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      examId_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.examApplication.stub.exam.Exam.internal_static_com_examApplication_stub_exam_ExamGRpcRequest_descriptor;
    }

    @java.lang.Override
    public com.examApplication.stub.exam.ExamGRpcRequest getDefaultInstanceForType() {
      return com.examApplication.stub.exam.ExamGRpcRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.examApplication.stub.exam.ExamGRpcRequest build() {
      com.examApplication.stub.exam.ExamGRpcRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.examApplication.stub.exam.ExamGRpcRequest buildPartial() {
      com.examApplication.stub.exam.ExamGRpcRequest result = new com.examApplication.stub.exam.ExamGRpcRequest(this);
      result.examId_ = examId_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.examApplication.stub.exam.ExamGRpcRequest) {
        return mergeFrom((com.examApplication.stub.exam.ExamGRpcRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.examApplication.stub.exam.ExamGRpcRequest other) {
      if (other == com.examApplication.stub.exam.ExamGRpcRequest.getDefaultInstance()) return this;
      if (other.getExamId() != 0L) {
        setExamId(other.getExamId());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.examApplication.stub.exam.ExamGRpcRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.examApplication.stub.exam.ExamGRpcRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long examId_ ;
    /**
     * <code>int64 examId = 1;</code>
     * @return The examId.
     */
    @java.lang.Override
    public long getExamId() {
      return examId_;
    }
    /**
     * <code>int64 examId = 1;</code>
     * @param value The examId to set.
     * @return This builder for chaining.
     */
    public Builder setExamId(long value) {
      
      examId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 examId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearExamId() {
      
      examId_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.examApplication.stub.exam.ExamGRpcRequest)
  }

  // @@protoc_insertion_point(class_scope:com.examApplication.stub.exam.ExamGRpcRequest)
  private static final com.examApplication.stub.exam.ExamGRpcRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.examApplication.stub.exam.ExamGRpcRequest();
  }

  public static com.examApplication.stub.exam.ExamGRpcRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExamGRpcRequest>
      PARSER = new com.google.protobuf.AbstractParser<ExamGRpcRequest>() {
    @java.lang.Override
    public ExamGRpcRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ExamGRpcRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ExamGRpcRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExamGRpcRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.examApplication.stub.exam.ExamGRpcRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
