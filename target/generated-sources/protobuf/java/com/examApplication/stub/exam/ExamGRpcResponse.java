// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: exam.proto

package com.examApplication.stub.exam;

/**
 * <pre>
 * This is the response message
 * </pre>
 *
 * Protobuf type {@code com.examApplication.stub.exam.ExamGRpcResponse}
 */
public final class ExamGRpcResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.examApplication.stub.exam.ExamGRpcResponse)
    ExamGRpcResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExamGRpcResponse.newBuilder() to construct.
  private ExamGRpcResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExamGRpcResponse() {
    date_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExamGRpcResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ExamGRpcResponse(
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
          case 16: {

            teacherId_ = input.readInt64();
            break;
          }
          case 24: {

            subjectId_ = input.readInt64();
            break;
          }
          case 32: {

            studentId_ = input.readInt64();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            date_ = s;
            break;
          }
          case 48: {

            grade_ = input.readInt64();
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
    return com.examApplication.stub.exam.Exam.internal_static_com_examApplication_stub_exam_ExamGRpcResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.examApplication.stub.exam.Exam.internal_static_com_examApplication_stub_exam_ExamGRpcResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.examApplication.stub.exam.ExamGRpcResponse.class, com.examApplication.stub.exam.ExamGRpcResponse.Builder.class);
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

  public static final int TEACHERID_FIELD_NUMBER = 2;
  private long teacherId_;
  /**
   * <code>int64 teacherId = 2;</code>
   * @return The teacherId.
   */
  @java.lang.Override
  public long getTeacherId() {
    return teacherId_;
  }

  public static final int SUBJECTID_FIELD_NUMBER = 3;
  private long subjectId_;
  /**
   * <code>int64 subjectId = 3;</code>
   * @return The subjectId.
   */
  @java.lang.Override
  public long getSubjectId() {
    return subjectId_;
  }

  public static final int STUDENTID_FIELD_NUMBER = 4;
  private long studentId_;
  /**
   * <code>int64 studentId = 4;</code>
   * @return The studentId.
   */
  @java.lang.Override
  public long getStudentId() {
    return studentId_;
  }

  public static final int DATE_FIELD_NUMBER = 5;
  private volatile java.lang.Object date_;
  /**
   * <code>string date = 5;</code>
   * @return The date.
   */
  @java.lang.Override
  public java.lang.String getDate() {
    java.lang.Object ref = date_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      date_ = s;
      return s;
    }
  }
  /**
   * <code>string date = 5;</code>
   * @return The bytes for date.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDateBytes() {
    java.lang.Object ref = date_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      date_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GRADE_FIELD_NUMBER = 6;
  private long grade_;
  /**
   * <code>int64 grade = 6;</code>
   * @return The grade.
   */
  @java.lang.Override
  public long getGrade() {
    return grade_;
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
    if (teacherId_ != 0L) {
      output.writeInt64(2, teacherId_);
    }
    if (subjectId_ != 0L) {
      output.writeInt64(3, subjectId_);
    }
    if (studentId_ != 0L) {
      output.writeInt64(4, studentId_);
    }
    if (!getDateBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, date_);
    }
    if (grade_ != 0L) {
      output.writeInt64(6, grade_);
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
    if (teacherId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, teacherId_);
    }
    if (subjectId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, subjectId_);
    }
    if (studentId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, studentId_);
    }
    if (!getDateBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, date_);
    }
    if (grade_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, grade_);
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
    if (!(obj instanceof com.examApplication.stub.exam.ExamGRpcResponse)) {
      return super.equals(obj);
    }
    com.examApplication.stub.exam.ExamGRpcResponse other = (com.examApplication.stub.exam.ExamGRpcResponse) obj;

    if (getExamId()
        != other.getExamId()) return false;
    if (getTeacherId()
        != other.getTeacherId()) return false;
    if (getSubjectId()
        != other.getSubjectId()) return false;
    if (getStudentId()
        != other.getStudentId()) return false;
    if (!getDate()
        .equals(other.getDate())) return false;
    if (getGrade()
        != other.getGrade()) return false;
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
    hash = (37 * hash) + TEACHERID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTeacherId());
    hash = (37 * hash) + SUBJECTID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSubjectId());
    hash = (37 * hash) + STUDENTID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getStudentId());
    hash = (37 * hash) + DATE_FIELD_NUMBER;
    hash = (53 * hash) + getDate().hashCode();
    hash = (37 * hash) + GRADE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getGrade());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.examApplication.stub.exam.ExamGRpcResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.examApplication.stub.exam.ExamGRpcResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.examApplication.stub.exam.ExamGRpcResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.examApplication.stub.exam.ExamGRpcResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.examApplication.stub.exam.ExamGRpcResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.examApplication.stub.exam.ExamGRpcResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.examApplication.stub.exam.ExamGRpcResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.examApplication.stub.exam.ExamGRpcResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.examApplication.stub.exam.ExamGRpcResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.examApplication.stub.exam.ExamGRpcResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.examApplication.stub.exam.ExamGRpcResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.examApplication.stub.exam.ExamGRpcResponse parseFrom(
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
  public static Builder newBuilder(com.examApplication.stub.exam.ExamGRpcResponse prototype) {
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
   * This is the response message
   * </pre>
   *
   * Protobuf type {@code com.examApplication.stub.exam.ExamGRpcResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.examApplication.stub.exam.ExamGRpcResponse)
      com.examApplication.stub.exam.ExamGRpcResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.examApplication.stub.exam.Exam.internal_static_com_examApplication_stub_exam_ExamGRpcResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.examApplication.stub.exam.Exam.internal_static_com_examApplication_stub_exam_ExamGRpcResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.examApplication.stub.exam.ExamGRpcResponse.class, com.examApplication.stub.exam.ExamGRpcResponse.Builder.class);
    }

    // Construct using com.examApplication.stub.exam.ExamGRpcResponse.newBuilder()
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

      teacherId_ = 0L;

      subjectId_ = 0L;

      studentId_ = 0L;

      date_ = "";

      grade_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.examApplication.stub.exam.Exam.internal_static_com_examApplication_stub_exam_ExamGRpcResponse_descriptor;
    }

    @java.lang.Override
    public com.examApplication.stub.exam.ExamGRpcResponse getDefaultInstanceForType() {
      return com.examApplication.stub.exam.ExamGRpcResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.examApplication.stub.exam.ExamGRpcResponse build() {
      com.examApplication.stub.exam.ExamGRpcResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.examApplication.stub.exam.ExamGRpcResponse buildPartial() {
      com.examApplication.stub.exam.ExamGRpcResponse result = new com.examApplication.stub.exam.ExamGRpcResponse(this);
      result.examId_ = examId_;
      result.teacherId_ = teacherId_;
      result.subjectId_ = subjectId_;
      result.studentId_ = studentId_;
      result.date_ = date_;
      result.grade_ = grade_;
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
      if (other instanceof com.examApplication.stub.exam.ExamGRpcResponse) {
        return mergeFrom((com.examApplication.stub.exam.ExamGRpcResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.examApplication.stub.exam.ExamGRpcResponse other) {
      if (other == com.examApplication.stub.exam.ExamGRpcResponse.getDefaultInstance()) return this;
      if (other.getExamId() != 0L) {
        setExamId(other.getExamId());
      }
      if (other.getTeacherId() != 0L) {
        setTeacherId(other.getTeacherId());
      }
      if (other.getSubjectId() != 0L) {
        setSubjectId(other.getSubjectId());
      }
      if (other.getStudentId() != 0L) {
        setStudentId(other.getStudentId());
      }
      if (!other.getDate().isEmpty()) {
        date_ = other.date_;
        onChanged();
      }
      if (other.getGrade() != 0L) {
        setGrade(other.getGrade());
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
      com.examApplication.stub.exam.ExamGRpcResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.examApplication.stub.exam.ExamGRpcResponse) e.getUnfinishedMessage();
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

    private long teacherId_ ;
    /**
     * <code>int64 teacherId = 2;</code>
     * @return The teacherId.
     */
    @java.lang.Override
    public long getTeacherId() {
      return teacherId_;
    }
    /**
     * <code>int64 teacherId = 2;</code>
     * @param value The teacherId to set.
     * @return This builder for chaining.
     */
    public Builder setTeacherId(long value) {
      
      teacherId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 teacherId = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTeacherId() {
      
      teacherId_ = 0L;
      onChanged();
      return this;
    }

    private long subjectId_ ;
    /**
     * <code>int64 subjectId = 3;</code>
     * @return The subjectId.
     */
    @java.lang.Override
    public long getSubjectId() {
      return subjectId_;
    }
    /**
     * <code>int64 subjectId = 3;</code>
     * @param value The subjectId to set.
     * @return This builder for chaining.
     */
    public Builder setSubjectId(long value) {
      
      subjectId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 subjectId = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSubjectId() {
      
      subjectId_ = 0L;
      onChanged();
      return this;
    }

    private long studentId_ ;
    /**
     * <code>int64 studentId = 4;</code>
     * @return The studentId.
     */
    @java.lang.Override
    public long getStudentId() {
      return studentId_;
    }
    /**
     * <code>int64 studentId = 4;</code>
     * @param value The studentId to set.
     * @return This builder for chaining.
     */
    public Builder setStudentId(long value) {
      
      studentId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 studentId = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearStudentId() {
      
      studentId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object date_ = "";
    /**
     * <code>string date = 5;</code>
     * @return The date.
     */
    public java.lang.String getDate() {
      java.lang.Object ref = date_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        date_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string date = 5;</code>
     * @return The bytes for date.
     */
    public com.google.protobuf.ByteString
        getDateBytes() {
      java.lang.Object ref = date_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        date_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string date = 5;</code>
     * @param value The date to set.
     * @return This builder for chaining.
     */
    public Builder setDate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      date_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string date = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearDate() {
      
      date_ = getDefaultInstance().getDate();
      onChanged();
      return this;
    }
    /**
     * <code>string date = 5;</code>
     * @param value The bytes for date to set.
     * @return This builder for chaining.
     */
    public Builder setDateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      date_ = value;
      onChanged();
      return this;
    }

    private long grade_ ;
    /**
     * <code>int64 grade = 6;</code>
     * @return The grade.
     */
    @java.lang.Override
    public long getGrade() {
      return grade_;
    }
    /**
     * <code>int64 grade = 6;</code>
     * @param value The grade to set.
     * @return This builder for chaining.
     */
    public Builder setGrade(long value) {
      
      grade_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 grade = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearGrade() {
      
      grade_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:com.examApplication.stub.exam.ExamGRpcResponse)
  }

  // @@protoc_insertion_point(class_scope:com.examApplication.stub.exam.ExamGRpcResponse)
  private static final com.examApplication.stub.exam.ExamGRpcResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.examApplication.stub.exam.ExamGRpcResponse();
  }

  public static com.examApplication.stub.exam.ExamGRpcResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExamGRpcResponse>
      PARSER = new com.google.protobuf.AbstractParser<ExamGRpcResponse>() {
    @java.lang.Override
    public ExamGRpcResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ExamGRpcResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ExamGRpcResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExamGRpcResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.examApplication.stub.exam.ExamGRpcResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

