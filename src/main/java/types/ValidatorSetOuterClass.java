// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: validator_set.proto

package types;

public final class ValidatorSetOuterClass {
  private ValidatorSetOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ValidatorSetOrBuilder extends
      // @@protoc_insertion_point(interface_extends:types.ValidatorSet)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .types.ValidatorPublicKeys validator_public_keys = 1;</code>
     */
    java.util.List<types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys> 
        getValidatorPublicKeysList();
    /**
     * <code>repeated .types.ValidatorPublicKeys validator_public_keys = 1;</code>
     */
    types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys getValidatorPublicKeys(int index);
    /**
     * <code>repeated .types.ValidatorPublicKeys validator_public_keys = 1;</code>
     */
    int getValidatorPublicKeysCount();
    /**
     * <code>repeated .types.ValidatorPublicKeys validator_public_keys = 1;</code>
     */
    java.util.List<? extends types.ValidatorPublicKeysOuterClass.ValidatorPublicKeysOrBuilder> 
        getValidatorPublicKeysOrBuilderList();
    /**
     * <code>repeated .types.ValidatorPublicKeys validator_public_keys = 1;</code>
     */
    types.ValidatorPublicKeysOuterClass.ValidatorPublicKeysOrBuilder getValidatorPublicKeysOrBuilder(
        int index);
  }
  /**
   * <pre>
   * Protobuf definition for the Rust struct ValidatorSet.
   * </pre>
   *
   * Protobuf type {@code types.ValidatorSet}
   */
  public  static final class ValidatorSet extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:types.ValidatorSet)
      ValidatorSetOrBuilder {
    // Use ValidatorSet.newBuilder() to construct.
    private ValidatorSet(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ValidatorSet() {
      validatorPublicKeys_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private ValidatorSet(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                validatorPublicKeys_ = new java.util.ArrayList<types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys>();
                mutable_bitField0_ |= 0x00000001;
              }
              validatorPublicKeys_.add(
                  input.readMessage(types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          validatorPublicKeys_ = java.util.Collections.unmodifiableList(validatorPublicKeys_);
        }
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return types.ValidatorSetOuterClass.internal_static_types_ValidatorSet_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return types.ValidatorSetOuterClass.internal_static_types_ValidatorSet_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              types.ValidatorSetOuterClass.ValidatorSet.class, types.ValidatorSetOuterClass.ValidatorSet.Builder.class);
    }

    public static final int VALIDATOR_PUBLIC_KEYS_FIELD_NUMBER = 1;
    private java.util.List<types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys> validatorPublicKeys_;
    /**
     * <code>repeated .types.ValidatorPublicKeys validator_public_keys = 1;</code>
     */
    public java.util.List<types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys> getValidatorPublicKeysList() {
      return validatorPublicKeys_;
    }
    /**
     * <code>repeated .types.ValidatorPublicKeys validator_public_keys = 1;</code>
     */
    public java.util.List<? extends types.ValidatorPublicKeysOuterClass.ValidatorPublicKeysOrBuilder> 
        getValidatorPublicKeysOrBuilderList() {
      return validatorPublicKeys_;
    }
    /**
     * <code>repeated .types.ValidatorPublicKeys validator_public_keys = 1;</code>
     */
    public int getValidatorPublicKeysCount() {
      return validatorPublicKeys_.size();
    }
    /**
     * <code>repeated .types.ValidatorPublicKeys validator_public_keys = 1;</code>
     */
    public types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys getValidatorPublicKeys(int index) {
      return validatorPublicKeys_.get(index);
    }
    /**
     * <code>repeated .types.ValidatorPublicKeys validator_public_keys = 1;</code>
     */
    public types.ValidatorPublicKeysOuterClass.ValidatorPublicKeysOrBuilder getValidatorPublicKeysOrBuilder(
        int index) {
      return validatorPublicKeys_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      for (int i = 0; i < validatorPublicKeys_.size(); i++) {
        output.writeMessage(1, validatorPublicKeys_.get(i));
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < validatorPublicKeys_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, validatorPublicKeys_.get(i));
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof types.ValidatorSetOuterClass.ValidatorSet)) {
        return super.equals(obj);
      }
      types.ValidatorSetOuterClass.ValidatorSet other = (types.ValidatorSetOuterClass.ValidatorSet) obj;

      boolean result = true;
      result = result && getValidatorPublicKeysList()
          .equals(other.getValidatorPublicKeysList());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getValidatorPublicKeysCount() > 0) {
        hash = (37 * hash) + VALIDATOR_PUBLIC_KEYS_FIELD_NUMBER;
        hash = (53 * hash) + getValidatorPublicKeysList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static types.ValidatorSetOuterClass.ValidatorSet parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static types.ValidatorSetOuterClass.ValidatorSet parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static types.ValidatorSetOuterClass.ValidatorSet parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static types.ValidatorSetOuterClass.ValidatorSet parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static types.ValidatorSetOuterClass.ValidatorSet parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static types.ValidatorSetOuterClass.ValidatorSet parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static types.ValidatorSetOuterClass.ValidatorSet parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static types.ValidatorSetOuterClass.ValidatorSet parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static types.ValidatorSetOuterClass.ValidatorSet parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static types.ValidatorSetOuterClass.ValidatorSet parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static types.ValidatorSetOuterClass.ValidatorSet parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static types.ValidatorSetOuterClass.ValidatorSet parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(types.ValidatorSetOuterClass.ValidatorSet prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
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
     * Protobuf definition for the Rust struct ValidatorSet.
     * </pre>
     *
     * Protobuf type {@code types.ValidatorSet}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:types.ValidatorSet)
        types.ValidatorSetOuterClass.ValidatorSetOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return types.ValidatorSetOuterClass.internal_static_types_ValidatorSet_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return types.ValidatorSetOuterClass.internal_static_types_ValidatorSet_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                types.ValidatorSetOuterClass.ValidatorSet.class, types.ValidatorSetOuterClass.ValidatorSet.Builder.class);
      }

      // Construct using types.ValidatorSetOuterClass.ValidatorSet.newBuilder()
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
          getValidatorPublicKeysFieldBuilder();
        }
      }
      public Builder clear() {
        super.clear();
        if (validatorPublicKeysBuilder_ == null) {
          validatorPublicKeys_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          validatorPublicKeysBuilder_.clear();
        }
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return types.ValidatorSetOuterClass.internal_static_types_ValidatorSet_descriptor;
      }

      public types.ValidatorSetOuterClass.ValidatorSet getDefaultInstanceForType() {
        return types.ValidatorSetOuterClass.ValidatorSet.getDefaultInstance();
      }

      public types.ValidatorSetOuterClass.ValidatorSet build() {
        types.ValidatorSetOuterClass.ValidatorSet result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public types.ValidatorSetOuterClass.ValidatorSet buildPartial() {
        types.ValidatorSetOuterClass.ValidatorSet result = new types.ValidatorSetOuterClass.ValidatorSet(this);
        int from_bitField0_ = bitField0_;
        if (validatorPublicKeysBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            validatorPublicKeys_ = java.util.Collections.unmodifiableList(validatorPublicKeys_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.validatorPublicKeys_ = validatorPublicKeys_;
        } else {
          result.validatorPublicKeys_ = validatorPublicKeysBuilder_.build();
        }
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof types.ValidatorSetOuterClass.ValidatorSet) {
          return mergeFrom((types.ValidatorSetOuterClass.ValidatorSet)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(types.ValidatorSetOuterClass.ValidatorSet other) {
        if (other == types.ValidatorSetOuterClass.ValidatorSet.getDefaultInstance()) return this;
        if (validatorPublicKeysBuilder_ == null) {
          if (!other.validatorPublicKeys_.isEmpty()) {
            if (validatorPublicKeys_.isEmpty()) {
              validatorPublicKeys_ = other.validatorPublicKeys_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureValidatorPublicKeysIsMutable();
              validatorPublicKeys_.addAll(other.validatorPublicKeys_);
            }
            onChanged();
          }
        } else {
          if (!other.validatorPublicKeys_.isEmpty()) {
            if (validatorPublicKeysBuilder_.isEmpty()) {
              validatorPublicKeysBuilder_.dispose();
              validatorPublicKeysBuilder_ = null;
              validatorPublicKeys_ = other.validatorPublicKeys_;
              bitField0_ = (bitField0_ & ~0x00000001);
              validatorPublicKeysBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getValidatorPublicKeysFieldBuilder() : null;
            } else {
              validatorPublicKeysBuilder_.addAllMessages(other.validatorPublicKeys_);
            }
          }
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        types.ValidatorSetOuterClass.ValidatorSet parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (types.ValidatorSetOuterClass.ValidatorSet) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys> validatorPublicKeys_ =
        java.util.Collections.emptyList();
      private void ensureValidatorPublicKeysIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          validatorPublicKeys_ = new java.util.ArrayList<types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys>(validatorPublicKeys_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys, types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys.Builder, types.ValidatorPublicKeysOuterClass.ValidatorPublicKeysOrBuilder> validatorPublicKeysBuilder_;

      /**
       * <code>repeated .types.ValidatorPublicKeys validator_public_keys = 1;</code>
       */
      public java.util.List<types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys> getValidatorPublicKeysList() {
        if (validatorPublicKeysBuilder_ == null) {
          return java.util.Collections.unmodifiableList(validatorPublicKeys_);
        } else {
          return validatorPublicKeysBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .types.ValidatorPublicKeys validator_public_keys = 1;</code>
       */
      public int getValidatorPublicKeysCount() {
        if (validatorPublicKeysBuilder_ == null) {
          return validatorPublicKeys_.size();
        } else {
          return validatorPublicKeysBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .types.ValidatorPublicKeys validator_public_keys = 1;</code>
       */
      public types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys getValidatorPublicKeys(int index) {
        if (validatorPublicKeysBuilder_ == null) {
          return validatorPublicKeys_.get(index);
        } else {
          return validatorPublicKeysBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .types.ValidatorPublicKeys validator_public_keys = 1;</code>
       */
      public Builder setValidatorPublicKeys(
          int index, types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys value) {
        if (validatorPublicKeysBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureValidatorPublicKeysIsMutable();
          validatorPublicKeys_.set(index, value);
          onChanged();
        } else {
          validatorPublicKeysBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .types.ValidatorPublicKeys validator_public_keys = 1;</code>
       */
      public Builder setValidatorPublicKeys(
          int index, types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys.Builder builderForValue) {
        if (validatorPublicKeysBuilder_ == null) {
          ensureValidatorPublicKeysIsMutable();
          validatorPublicKeys_.set(index, builderForValue.build());
          onChanged();
        } else {
          validatorPublicKeysBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .types.ValidatorPublicKeys validator_public_keys = 1;</code>
       */
      public Builder addValidatorPublicKeys(types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys value) {
        if (validatorPublicKeysBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureValidatorPublicKeysIsMutable();
          validatorPublicKeys_.add(value);
          onChanged();
        } else {
          validatorPublicKeysBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .types.ValidatorPublicKeys validator_public_keys = 1;</code>
       */
      public Builder addValidatorPublicKeys(
          int index, types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys value) {
        if (validatorPublicKeysBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureValidatorPublicKeysIsMutable();
          validatorPublicKeys_.add(index, value);
          onChanged();
        } else {
          validatorPublicKeysBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .types.ValidatorPublicKeys validator_public_keys = 1;</code>
       */
      public Builder addValidatorPublicKeys(
          types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys.Builder builderForValue) {
        if (validatorPublicKeysBuilder_ == null) {
          ensureValidatorPublicKeysIsMutable();
          validatorPublicKeys_.add(builderForValue.build());
          onChanged();
        } else {
          validatorPublicKeysBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .types.ValidatorPublicKeys validator_public_keys = 1;</code>
       */
      public Builder addValidatorPublicKeys(
          int index, types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys.Builder builderForValue) {
        if (validatorPublicKeysBuilder_ == null) {
          ensureValidatorPublicKeysIsMutable();
          validatorPublicKeys_.add(index, builderForValue.build());
          onChanged();
        } else {
          validatorPublicKeysBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .types.ValidatorPublicKeys validator_public_keys = 1;</code>
       */
      public Builder addAllValidatorPublicKeys(
          java.lang.Iterable<? extends types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys> values) {
        if (validatorPublicKeysBuilder_ == null) {
          ensureValidatorPublicKeysIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, validatorPublicKeys_);
          onChanged();
        } else {
          validatorPublicKeysBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .types.ValidatorPublicKeys validator_public_keys = 1;</code>
       */
      public Builder clearValidatorPublicKeys() {
        if (validatorPublicKeysBuilder_ == null) {
          validatorPublicKeys_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          validatorPublicKeysBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .types.ValidatorPublicKeys validator_public_keys = 1;</code>
       */
      public Builder removeValidatorPublicKeys(int index) {
        if (validatorPublicKeysBuilder_ == null) {
          ensureValidatorPublicKeysIsMutable();
          validatorPublicKeys_.remove(index);
          onChanged();
        } else {
          validatorPublicKeysBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .types.ValidatorPublicKeys validator_public_keys = 1;</code>
       */
      public types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys.Builder getValidatorPublicKeysBuilder(
          int index) {
        return getValidatorPublicKeysFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .types.ValidatorPublicKeys validator_public_keys = 1;</code>
       */
      public types.ValidatorPublicKeysOuterClass.ValidatorPublicKeysOrBuilder getValidatorPublicKeysOrBuilder(
          int index) {
        if (validatorPublicKeysBuilder_ == null) {
          return validatorPublicKeys_.get(index);  } else {
          return validatorPublicKeysBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .types.ValidatorPublicKeys validator_public_keys = 1;</code>
       */
      public java.util.List<? extends types.ValidatorPublicKeysOuterClass.ValidatorPublicKeysOrBuilder> 
           getValidatorPublicKeysOrBuilderList() {
        if (validatorPublicKeysBuilder_ != null) {
          return validatorPublicKeysBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(validatorPublicKeys_);
        }
      }
      /**
       * <code>repeated .types.ValidatorPublicKeys validator_public_keys = 1;</code>
       */
      public types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys.Builder addValidatorPublicKeysBuilder() {
        return getValidatorPublicKeysFieldBuilder().addBuilder(
            types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys.getDefaultInstance());
      }
      /**
       * <code>repeated .types.ValidatorPublicKeys validator_public_keys = 1;</code>
       */
      public types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys.Builder addValidatorPublicKeysBuilder(
          int index) {
        return getValidatorPublicKeysFieldBuilder().addBuilder(
            index, types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys.getDefaultInstance());
      }
      /**
       * <code>repeated .types.ValidatorPublicKeys validator_public_keys = 1;</code>
       */
      public java.util.List<types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys.Builder> 
           getValidatorPublicKeysBuilderList() {
        return getValidatorPublicKeysFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys, types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys.Builder, types.ValidatorPublicKeysOuterClass.ValidatorPublicKeysOrBuilder> 
          getValidatorPublicKeysFieldBuilder() {
        if (validatorPublicKeysBuilder_ == null) {
          validatorPublicKeysBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys, types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys.Builder, types.ValidatorPublicKeysOuterClass.ValidatorPublicKeysOrBuilder>(
                  validatorPublicKeys_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          validatorPublicKeys_ = null;
        }
        return validatorPublicKeysBuilder_;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:types.ValidatorSet)
    }

    // @@protoc_insertion_point(class_scope:types.ValidatorSet)
    private static final types.ValidatorSetOuterClass.ValidatorSet DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new types.ValidatorSetOuterClass.ValidatorSet();
    }

    public static types.ValidatorSetOuterClass.ValidatorSet getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ValidatorSet>
        PARSER = new com.google.protobuf.AbstractParser<ValidatorSet>() {
      public ValidatorSet parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new ValidatorSet(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ValidatorSet> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ValidatorSet> getParserForType() {
      return PARSER;
    }

    public types.ValidatorSetOuterClass.ValidatorSet getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_types_ValidatorSet_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_types_ValidatorSet_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023validator_set.proto\022\005types\032\033validator_" +
      "public_keys.proto\"I\n\014ValidatorSet\0229\n\025val" +
      "idator_public_keys\030\001 \003(\0132\032.types.Validat" +
      "orPublicKeysb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          types.ValidatorPublicKeysOuterClass.getDescriptor(),
        }, assigner);
    internal_static_types_ValidatorSet_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_types_ValidatorSet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_types_ValidatorSet_descriptor,
        new java.lang.String[] { "ValidatorPublicKeys", });
    types.ValidatorPublicKeysOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}