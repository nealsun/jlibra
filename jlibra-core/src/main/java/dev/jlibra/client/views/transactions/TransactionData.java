package dev.jlibra.client.views.transactions;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

@JsonTypeInfo(use = Id.NAME, include = As.PROPERTY, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = ImmutableBlockMetadataTransaction.class, name = "blockmetadata"),
        @JsonSubTypes.Type(value = ImmutableUnknownTransaction.class, name = "unknown"),
        @JsonSubTypes.Type(value = ImmutableWriteSetTransaction.class, name = "writeset"),
        @JsonSubTypes.Type(value = ImmutableUserTransaction.class, name = "user")
})
public interface TransactionData {

}
