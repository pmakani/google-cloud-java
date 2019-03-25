// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/admin/v1/firestore_admin.proto

package com.google.firestore.admin.v1;

/**
 *
 *
 * <pre>
 * The response for [FirestoreAdmin.ListIndexes][google.firestore.admin.v1.FirestoreAdmin.ListIndexes].
 * </pre>
 *
 * Protobuf type {@code google.firestore.admin.v1.ListIndexesResponse}
 */
public final class ListIndexesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.firestore.admin.v1.ListIndexesResponse)
    ListIndexesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListIndexesResponse.newBuilder() to construct.
  private ListIndexesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListIndexesResponse() {
    indexes_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListIndexesResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10:
            {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                indexes_ = new java.util.ArrayList<com.google.firestore.admin.v1.Index>();
                mutable_bitField0_ |= 0x00000001;
              }
              indexes_.add(
                  input.readMessage(
                      com.google.firestore.admin.v1.Index.parser(), extensionRegistry));
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              nextPageToken_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        indexes_ = java.util.Collections.unmodifiableList(indexes_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.firestore.admin.v1.FirestoreAdminProto
        .internal_static_google_firestore_admin_v1_ListIndexesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.firestore.admin.v1.FirestoreAdminProto
        .internal_static_google_firestore_admin_v1_ListIndexesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.firestore.admin.v1.ListIndexesResponse.class,
            com.google.firestore.admin.v1.ListIndexesResponse.Builder.class);
  }

  private int bitField0_;
  public static final int INDEXES_FIELD_NUMBER = 1;
  private java.util.List<com.google.firestore.admin.v1.Index> indexes_;
  /**
   *
   *
   * <pre>
   * The requested indexes.
   * </pre>
   *
   * <code>repeated .google.firestore.admin.v1.Index indexes = 1;</code>
   */
  public java.util.List<com.google.firestore.admin.v1.Index> getIndexesList() {
    return indexes_;
  }
  /**
   *
   *
   * <pre>
   * The requested indexes.
   * </pre>
   *
   * <code>repeated .google.firestore.admin.v1.Index indexes = 1;</code>
   */
  public java.util.List<? extends com.google.firestore.admin.v1.IndexOrBuilder>
      getIndexesOrBuilderList() {
    return indexes_;
  }
  /**
   *
   *
   * <pre>
   * The requested indexes.
   * </pre>
   *
   * <code>repeated .google.firestore.admin.v1.Index indexes = 1;</code>
   */
  public int getIndexesCount() {
    return indexes_.size();
  }
  /**
   *
   *
   * <pre>
   * The requested indexes.
   * </pre>
   *
   * <code>repeated .google.firestore.admin.v1.Index indexes = 1;</code>
   */
  public com.google.firestore.admin.v1.Index getIndexes(int index) {
    return indexes_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The requested indexes.
   * </pre>
   *
   * <code>repeated .google.firestore.admin.v1.Index indexes = 1;</code>
   */
  public com.google.firestore.admin.v1.IndexOrBuilder getIndexesOrBuilder(int index) {
    return indexes_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * A page token that may be used to request another page of results. If blank,
   * this is the last page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A page token that may be used to request another page of results. If blank,
   * this is the last page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < indexes_.size(); i++) {
      output.writeMessage(1, indexes_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < indexes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, indexes_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.firestore.admin.v1.ListIndexesResponse)) {
      return super.equals(obj);
    }
    com.google.firestore.admin.v1.ListIndexesResponse other =
        (com.google.firestore.admin.v1.ListIndexesResponse) obj;

    boolean result = true;
    result = result && getIndexesList().equals(other.getIndexesList());
    result = result && getNextPageToken().equals(other.getNextPageToken());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getIndexesCount() > 0) {
      hash = (37 * hash) + INDEXES_FIELD_NUMBER;
      hash = (53 * hash) + getIndexesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.firestore.admin.v1.ListIndexesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.firestore.admin.v1.ListIndexesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.firestore.admin.v1.ListIndexesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.firestore.admin.v1.ListIndexesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.firestore.admin.v1.ListIndexesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.firestore.admin.v1.ListIndexesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.firestore.admin.v1.ListIndexesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.firestore.admin.v1.ListIndexesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.firestore.admin.v1.ListIndexesResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.firestore.admin.v1.ListIndexesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.firestore.admin.v1.ListIndexesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.firestore.admin.v1.ListIndexesResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.firestore.admin.v1.ListIndexesResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The response for [FirestoreAdmin.ListIndexes][google.firestore.admin.v1.FirestoreAdmin.ListIndexes].
   * </pre>
   *
   * Protobuf type {@code google.firestore.admin.v1.ListIndexesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.firestore.admin.v1.ListIndexesResponse)
      com.google.firestore.admin.v1.ListIndexesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.firestore.admin.v1.FirestoreAdminProto
          .internal_static_google_firestore_admin_v1_ListIndexesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.firestore.admin.v1.FirestoreAdminProto
          .internal_static_google_firestore_admin_v1_ListIndexesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.firestore.admin.v1.ListIndexesResponse.class,
              com.google.firestore.admin.v1.ListIndexesResponse.Builder.class);
    }

    // Construct using com.google.firestore.admin.v1.ListIndexesResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getIndexesFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (indexesBuilder_ == null) {
        indexes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        indexesBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.firestore.admin.v1.FirestoreAdminProto
          .internal_static_google_firestore_admin_v1_ListIndexesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.firestore.admin.v1.ListIndexesResponse getDefaultInstanceForType() {
      return com.google.firestore.admin.v1.ListIndexesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.firestore.admin.v1.ListIndexesResponse build() {
      com.google.firestore.admin.v1.ListIndexesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.firestore.admin.v1.ListIndexesResponse buildPartial() {
      com.google.firestore.admin.v1.ListIndexesResponse result =
          new com.google.firestore.admin.v1.ListIndexesResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (indexesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          indexes_ = java.util.Collections.unmodifiableList(indexes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.indexes_ = indexes_;
      } else {
        result.indexes_ = indexesBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.firestore.admin.v1.ListIndexesResponse) {
        return mergeFrom((com.google.firestore.admin.v1.ListIndexesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.firestore.admin.v1.ListIndexesResponse other) {
      if (other == com.google.firestore.admin.v1.ListIndexesResponse.getDefaultInstance())
        return this;
      if (indexesBuilder_ == null) {
        if (!other.indexes_.isEmpty()) {
          if (indexes_.isEmpty()) {
            indexes_ = other.indexes_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureIndexesIsMutable();
            indexes_.addAll(other.indexes_);
          }
          onChanged();
        }
      } else {
        if (!other.indexes_.isEmpty()) {
          if (indexesBuilder_.isEmpty()) {
            indexesBuilder_.dispose();
            indexesBuilder_ = null;
            indexes_ = other.indexes_;
            bitField0_ = (bitField0_ & ~0x00000001);
            indexesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getIndexesFieldBuilder()
                    : null;
          } else {
            indexesBuilder_.addAllMessages(other.indexes_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
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
      com.google.firestore.admin.v1.ListIndexesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.firestore.admin.v1.ListIndexesResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.firestore.admin.v1.Index> indexes_ =
        java.util.Collections.emptyList();

    private void ensureIndexesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        indexes_ = new java.util.ArrayList<com.google.firestore.admin.v1.Index>(indexes_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.firestore.admin.v1.Index,
            com.google.firestore.admin.v1.Index.Builder,
            com.google.firestore.admin.v1.IndexOrBuilder>
        indexesBuilder_;

    /**
     *
     *
     * <pre>
     * The requested indexes.
     * </pre>
     *
     * <code>repeated .google.firestore.admin.v1.Index indexes = 1;</code>
     */
    public java.util.List<com.google.firestore.admin.v1.Index> getIndexesList() {
      if (indexesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(indexes_);
      } else {
        return indexesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The requested indexes.
     * </pre>
     *
     * <code>repeated .google.firestore.admin.v1.Index indexes = 1;</code>
     */
    public int getIndexesCount() {
      if (indexesBuilder_ == null) {
        return indexes_.size();
      } else {
        return indexesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The requested indexes.
     * </pre>
     *
     * <code>repeated .google.firestore.admin.v1.Index indexes = 1;</code>
     */
    public com.google.firestore.admin.v1.Index getIndexes(int index) {
      if (indexesBuilder_ == null) {
        return indexes_.get(index);
      } else {
        return indexesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The requested indexes.
     * </pre>
     *
     * <code>repeated .google.firestore.admin.v1.Index indexes = 1;</code>
     */
    public Builder setIndexes(int index, com.google.firestore.admin.v1.Index value) {
      if (indexesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIndexesIsMutable();
        indexes_.set(index, value);
        onChanged();
      } else {
        indexesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The requested indexes.
     * </pre>
     *
     * <code>repeated .google.firestore.admin.v1.Index indexes = 1;</code>
     */
    public Builder setIndexes(
        int index, com.google.firestore.admin.v1.Index.Builder builderForValue) {
      if (indexesBuilder_ == null) {
        ensureIndexesIsMutable();
        indexes_.set(index, builderForValue.build());
        onChanged();
      } else {
        indexesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The requested indexes.
     * </pre>
     *
     * <code>repeated .google.firestore.admin.v1.Index indexes = 1;</code>
     */
    public Builder addIndexes(com.google.firestore.admin.v1.Index value) {
      if (indexesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIndexesIsMutable();
        indexes_.add(value);
        onChanged();
      } else {
        indexesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The requested indexes.
     * </pre>
     *
     * <code>repeated .google.firestore.admin.v1.Index indexes = 1;</code>
     */
    public Builder addIndexes(int index, com.google.firestore.admin.v1.Index value) {
      if (indexesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIndexesIsMutable();
        indexes_.add(index, value);
        onChanged();
      } else {
        indexesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The requested indexes.
     * </pre>
     *
     * <code>repeated .google.firestore.admin.v1.Index indexes = 1;</code>
     */
    public Builder addIndexes(com.google.firestore.admin.v1.Index.Builder builderForValue) {
      if (indexesBuilder_ == null) {
        ensureIndexesIsMutable();
        indexes_.add(builderForValue.build());
        onChanged();
      } else {
        indexesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The requested indexes.
     * </pre>
     *
     * <code>repeated .google.firestore.admin.v1.Index indexes = 1;</code>
     */
    public Builder addIndexes(
        int index, com.google.firestore.admin.v1.Index.Builder builderForValue) {
      if (indexesBuilder_ == null) {
        ensureIndexesIsMutable();
        indexes_.add(index, builderForValue.build());
        onChanged();
      } else {
        indexesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The requested indexes.
     * </pre>
     *
     * <code>repeated .google.firestore.admin.v1.Index indexes = 1;</code>
     */
    public Builder addAllIndexes(
        java.lang.Iterable<? extends com.google.firestore.admin.v1.Index> values) {
      if (indexesBuilder_ == null) {
        ensureIndexesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, indexes_);
        onChanged();
      } else {
        indexesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The requested indexes.
     * </pre>
     *
     * <code>repeated .google.firestore.admin.v1.Index indexes = 1;</code>
     */
    public Builder clearIndexes() {
      if (indexesBuilder_ == null) {
        indexes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        indexesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The requested indexes.
     * </pre>
     *
     * <code>repeated .google.firestore.admin.v1.Index indexes = 1;</code>
     */
    public Builder removeIndexes(int index) {
      if (indexesBuilder_ == null) {
        ensureIndexesIsMutable();
        indexes_.remove(index);
        onChanged();
      } else {
        indexesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The requested indexes.
     * </pre>
     *
     * <code>repeated .google.firestore.admin.v1.Index indexes = 1;</code>
     */
    public com.google.firestore.admin.v1.Index.Builder getIndexesBuilder(int index) {
      return getIndexesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The requested indexes.
     * </pre>
     *
     * <code>repeated .google.firestore.admin.v1.Index indexes = 1;</code>
     */
    public com.google.firestore.admin.v1.IndexOrBuilder getIndexesOrBuilder(int index) {
      if (indexesBuilder_ == null) {
        return indexes_.get(index);
      } else {
        return indexesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The requested indexes.
     * </pre>
     *
     * <code>repeated .google.firestore.admin.v1.Index indexes = 1;</code>
     */
    public java.util.List<? extends com.google.firestore.admin.v1.IndexOrBuilder>
        getIndexesOrBuilderList() {
      if (indexesBuilder_ != null) {
        return indexesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(indexes_);
      }
    }
    /**
     *
     *
     * <pre>
     * The requested indexes.
     * </pre>
     *
     * <code>repeated .google.firestore.admin.v1.Index indexes = 1;</code>
     */
    public com.google.firestore.admin.v1.Index.Builder addIndexesBuilder() {
      return getIndexesFieldBuilder()
          .addBuilder(com.google.firestore.admin.v1.Index.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The requested indexes.
     * </pre>
     *
     * <code>repeated .google.firestore.admin.v1.Index indexes = 1;</code>
     */
    public com.google.firestore.admin.v1.Index.Builder addIndexesBuilder(int index) {
      return getIndexesFieldBuilder()
          .addBuilder(index, com.google.firestore.admin.v1.Index.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The requested indexes.
     * </pre>
     *
     * <code>repeated .google.firestore.admin.v1.Index indexes = 1;</code>
     */
    public java.util.List<com.google.firestore.admin.v1.Index.Builder> getIndexesBuilderList() {
      return getIndexesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.firestore.admin.v1.Index,
            com.google.firestore.admin.v1.Index.Builder,
            com.google.firestore.admin.v1.IndexOrBuilder>
        getIndexesFieldBuilder() {
      if (indexesBuilder_ == null) {
        indexesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.firestore.admin.v1.Index,
                com.google.firestore.admin.v1.Index.Builder,
                com.google.firestore.admin.v1.IndexOrBuilder>(
                indexes_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        indexes_ = null;
      }
      return indexesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A page token that may be used to request another page of results. If blank,
     * this is the last page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A page token that may be used to request another page of results. If blank,
     * this is the last page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A page token that may be used to request another page of results. If blank,
     * this is the last page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A page token that may be used to request another page of results. If blank,
     * this is the last page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A page token that may be used to request another page of results. If blank,
     * this is the last page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.firestore.admin.v1.ListIndexesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.firestore.admin.v1.ListIndexesResponse)
  private static final com.google.firestore.admin.v1.ListIndexesResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.firestore.admin.v1.ListIndexesResponse();
  }

  public static com.google.firestore.admin.v1.ListIndexesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListIndexesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListIndexesResponse>() {
        @java.lang.Override
        public ListIndexesResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListIndexesResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListIndexesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListIndexesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.firestore.admin.v1.ListIndexesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
