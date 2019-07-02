// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: validator_public_keys.proto

package types;

public final class ValidatorPublicKeysOuterClass {
  private ValidatorPublicKeysOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ValidatorPublicKeysOrBuilder extends
      // @@protoc_insertion_point(interface_extends:types.ValidatorPublicKeys)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Validator account address
     * </pre>
     *
     * <code>bytes account_address = 1;</code>
     */
    com.google.protobuf.ByteString getAccountAddress();

    /**
     * <pre>
     * Consensus public key
     * </pre>
     *
     * <code>bytes consensus_public_key = 2;</code>
     */
    com.google.protobuf.ByteString getConsensusPublicKey();

    /**
     * <pre>
     * Network signing publick key
     * </pre>
     *
     * <code>bytes network_signing_public_key = 3;</code>
     */
    com.google.protobuf.ByteString getNetworkSigningPublicKey();

    /**
     * <pre>
     *&#47; Network identity publick key
     * </pre>
     *
     * <code>bytes network_identity_public_key = 4;</code>
     */
    com.google.protobuf.ByteString getNetworkIdentityPublicKey();
  }
  /**
   * <pre>
   * Protobuf definition for the Rust struct ValidatorPublicKeys
   * </pre>
   *
   * Protobuf type {@code types.ValidatorPublicKeys}
   */
  public  static final class ValidatorPublicKeys extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:types.ValidatorPublicKeys)
      ValidatorPublicKeysOrBuilder {
    // Use ValidatorPublicKeys.newBuilder() to construct.
    private ValidatorPublicKeys(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ValidatorPublicKeys() {
      accountAddress_ = com.google.protobuf.ByteString.EMPTY;
      consensusPublicKey_ = com.google.protobuf.ByteString.EMPTY;
      networkSigningPublicKey_ = com.google.protobuf.ByteString.EMPTY;
      networkIdentityPublicKey_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private ValidatorPublicKeys(
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

              accountAddress_ = input.readBytes();
              break;
            }
            case 18: {

              consensusPublicKey_ = input.readBytes();
              break;
            }
            case 26: {

              networkSigningPublicKey_ = input.readBytes();
              break;
            }
            case 34: {

              networkIdentityPublicKey_ = input.readBytes();
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
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return types.ValidatorPublicKeysOuterClass.internal_static_types_ValidatorPublicKeys_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return types.ValidatorPublicKeysOuterClass.internal_static_types_ValidatorPublicKeys_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys.class, types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys.Builder.class);
    }

    public static final int ACCOUNT_ADDRESS_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString accountAddress_;
    /**
     * <pre>
     * Validator account address
     * </pre>
     *
     * <code>bytes account_address = 1;</code>
     */
    public com.google.protobuf.ByteString getAccountAddress() {
      return accountAddress_;
    }

    public static final int CONSENSUS_PUBLIC_KEY_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString consensusPublicKey_;
    /**
     * <pre>
     * Consensus public key
     * </pre>
     *
     * <code>bytes consensus_public_key = 2;</code>
     */
    public com.google.protobuf.ByteString getConsensusPublicKey() {
      return consensusPublicKey_;
    }

    public static final int NETWORK_SIGNING_PUBLIC_KEY_FIELD_NUMBER = 3;
    private com.google.protobuf.ByteString networkSigningPublicKey_;
    /**
     * <pre>
     * Network signing publick key
     * </pre>
     *
     * <code>bytes network_signing_public_key = 3;</code>
     */
    public com.google.protobuf.ByteString getNetworkSigningPublicKey() {
      return networkSigningPublicKey_;
    }

    public static final int NETWORK_IDENTITY_PUBLIC_KEY_FIELD_NUMBER = 4;
    private com.google.protobuf.ByteString networkIdentityPublicKey_;
    /**
     * <pre>
     *&#47; Network identity publick key
     * </pre>
     *
     * <code>bytes network_identity_public_key = 4;</code>
     */
    public com.google.protobuf.ByteString getNetworkIdentityPublicKey() {
      return networkIdentityPublicKey_;
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
      if (!accountAddress_.isEmpty()) {
        output.writeBytes(1, accountAddress_);
      }
      if (!consensusPublicKey_.isEmpty()) {
        output.writeBytes(2, consensusPublicKey_);
      }
      if (!networkSigningPublicKey_.isEmpty()) {
        output.writeBytes(3, networkSigningPublicKey_);
      }
      if (!networkIdentityPublicKey_.isEmpty()) {
        output.writeBytes(4, networkIdentityPublicKey_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!accountAddress_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, accountAddress_);
      }
      if (!consensusPublicKey_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, consensusPublicKey_);
      }
      if (!networkSigningPublicKey_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, networkSigningPublicKey_);
      }
      if (!networkIdentityPublicKey_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, networkIdentityPublicKey_);
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
      if (!(obj instanceof types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys)) {
        return super.equals(obj);
      }
      types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys other = (types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys) obj;

      boolean result = true;
      result = result && getAccountAddress()
          .equals(other.getAccountAddress());
      result = result && getConsensusPublicKey()
          .equals(other.getConsensusPublicKey());
      result = result && getNetworkSigningPublicKey()
          .equals(other.getNetworkSigningPublicKey());
      result = result && getNetworkIdentityPublicKey()
          .equals(other.getNetworkIdentityPublicKey());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ACCOUNT_ADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + getAccountAddress().hashCode();
      hash = (37 * hash) + CONSENSUS_PUBLIC_KEY_FIELD_NUMBER;
      hash = (53 * hash) + getConsensusPublicKey().hashCode();
      hash = (37 * hash) + NETWORK_SIGNING_PUBLIC_KEY_FIELD_NUMBER;
      hash = (53 * hash) + getNetworkSigningPublicKey().hashCode();
      hash = (37 * hash) + NETWORK_IDENTITY_PUBLIC_KEY_FIELD_NUMBER;
      hash = (53 * hash) + getNetworkIdentityPublicKey().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys parseFrom(
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
    public static Builder newBuilder(types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys prototype) {
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
     * Protobuf definition for the Rust struct ValidatorPublicKeys
     * </pre>
     *
     * Protobuf type {@code types.ValidatorPublicKeys}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:types.ValidatorPublicKeys)
        types.ValidatorPublicKeysOuterClass.ValidatorPublicKeysOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return types.ValidatorPublicKeysOuterClass.internal_static_types_ValidatorPublicKeys_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return types.ValidatorPublicKeysOuterClass.internal_static_types_ValidatorPublicKeys_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys.class, types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys.Builder.class);
      }

      // Construct using types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys.newBuilder()
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
      public Builder clear() {
        super.clear();
        accountAddress_ = com.google.protobuf.ByteString.EMPTY;

        consensusPublicKey_ = com.google.protobuf.ByteString.EMPTY;

        networkSigningPublicKey_ = com.google.protobuf.ByteString.EMPTY;

        networkIdentityPublicKey_ = com.google.protobuf.ByteString.EMPTY;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return types.ValidatorPublicKeysOuterClass.internal_static_types_ValidatorPublicKeys_descriptor;
      }

      public types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys getDefaultInstanceForType() {
        return types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys.getDefaultInstance();
      }

      public types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys build() {
        types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys buildPartial() {
        types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys result = new types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys(this);
        result.accountAddress_ = accountAddress_;
        result.consensusPublicKey_ = consensusPublicKey_;
        result.networkSigningPublicKey_ = networkSigningPublicKey_;
        result.networkIdentityPublicKey_ = networkIdentityPublicKey_;
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
        if (other instanceof types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys) {
          return mergeFrom((types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys other) {
        if (other == types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys.getDefaultInstance()) return this;
        if (other.getAccountAddress() != com.google.protobuf.ByteString.EMPTY) {
          setAccountAddress(other.getAccountAddress());
        }
        if (other.getConsensusPublicKey() != com.google.protobuf.ByteString.EMPTY) {
          setConsensusPublicKey(other.getConsensusPublicKey());
        }
        if (other.getNetworkSigningPublicKey() != com.google.protobuf.ByteString.EMPTY) {
          setNetworkSigningPublicKey(other.getNetworkSigningPublicKey());
        }
        if (other.getNetworkIdentityPublicKey() != com.google.protobuf.ByteString.EMPTY) {
          setNetworkIdentityPublicKey(other.getNetworkIdentityPublicKey());
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
        types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.google.protobuf.ByteString accountAddress_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <pre>
       * Validator account address
       * </pre>
       *
       * <code>bytes account_address = 1;</code>
       */
      public com.google.protobuf.ByteString getAccountAddress() {
        return accountAddress_;
      }
      /**
       * <pre>
       * Validator account address
       * </pre>
       *
       * <code>bytes account_address = 1;</code>
       */
      public Builder setAccountAddress(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        accountAddress_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Validator account address
       * </pre>
       *
       * <code>bytes account_address = 1;</code>
       */
      public Builder clearAccountAddress() {
        
        accountAddress_ = getDefaultInstance().getAccountAddress();
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString consensusPublicKey_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <pre>
       * Consensus public key
       * </pre>
       *
       * <code>bytes consensus_public_key = 2;</code>
       */
      public com.google.protobuf.ByteString getConsensusPublicKey() {
        return consensusPublicKey_;
      }
      /**
       * <pre>
       * Consensus public key
       * </pre>
       *
       * <code>bytes consensus_public_key = 2;</code>
       */
      public Builder setConsensusPublicKey(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        consensusPublicKey_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Consensus public key
       * </pre>
       *
       * <code>bytes consensus_public_key = 2;</code>
       */
      public Builder clearConsensusPublicKey() {
        
        consensusPublicKey_ = getDefaultInstance().getConsensusPublicKey();
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString networkSigningPublicKey_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <pre>
       * Network signing publick key
       * </pre>
       *
       * <code>bytes network_signing_public_key = 3;</code>
       */
      public com.google.protobuf.ByteString getNetworkSigningPublicKey() {
        return networkSigningPublicKey_;
      }
      /**
       * <pre>
       * Network signing publick key
       * </pre>
       *
       * <code>bytes network_signing_public_key = 3;</code>
       */
      public Builder setNetworkSigningPublicKey(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        networkSigningPublicKey_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Network signing publick key
       * </pre>
       *
       * <code>bytes network_signing_public_key = 3;</code>
       */
      public Builder clearNetworkSigningPublicKey() {
        
        networkSigningPublicKey_ = getDefaultInstance().getNetworkSigningPublicKey();
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString networkIdentityPublicKey_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <pre>
       *&#47; Network identity publick key
       * </pre>
       *
       * <code>bytes network_identity_public_key = 4;</code>
       */
      public com.google.protobuf.ByteString getNetworkIdentityPublicKey() {
        return networkIdentityPublicKey_;
      }
      /**
       * <pre>
       *&#47; Network identity publick key
       * </pre>
       *
       * <code>bytes network_identity_public_key = 4;</code>
       */
      public Builder setNetworkIdentityPublicKey(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        networkIdentityPublicKey_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *&#47; Network identity publick key
       * </pre>
       *
       * <code>bytes network_identity_public_key = 4;</code>
       */
      public Builder clearNetworkIdentityPublicKey() {
        
        networkIdentityPublicKey_ = getDefaultInstance().getNetworkIdentityPublicKey();
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:types.ValidatorPublicKeys)
    }

    // @@protoc_insertion_point(class_scope:types.ValidatorPublicKeys)
    private static final types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys();
    }

    public static types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ValidatorPublicKeys>
        PARSER = new com.google.protobuf.AbstractParser<ValidatorPublicKeys>() {
      public ValidatorPublicKeys parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new ValidatorPublicKeys(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ValidatorPublicKeys> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ValidatorPublicKeys> getParserForType() {
      return PARSER;
    }

    public types.ValidatorPublicKeysOuterClass.ValidatorPublicKeys getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_types_ValidatorPublicKeys_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_types_ValidatorPublicKeys_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033validator_public_keys.proto\022\005types\"\225\001\n" +
      "\023ValidatorPublicKeys\022\027\n\017account_address\030" +
      "\001 \001(\014\022\034\n\024consensus_public_key\030\002 \001(\014\022\"\n\032n" +
      "etwork_signing_public_key\030\003 \001(\014\022#\n\033netwo" +
      "rk_identity_public_key\030\004 \001(\014b\006proto3"
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
        }, assigner);
    internal_static_types_ValidatorPublicKeys_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_types_ValidatorPublicKeys_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_types_ValidatorPublicKeys_descriptor,
        new java.lang.String[] { "AccountAddress", "ConsensusPublicKey", "NetworkSigningPublicKey", "NetworkIdentityPublicKey", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}