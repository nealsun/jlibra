package dev.jlibra.type;

import dev.jlibra.serialization.ByteArray;
import dev.jlibra.serialization.ByteSequence;
import dev.jlibra.serialization.Deserialization;
import dev.jlibra.serialization.lcs.LCS;
import org.immutables.value.Value;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

@Value.Immutable
@LCS.Structure
public interface AccountState {
    @LCS.Field(value = 0)
    Map<ByteSequence, ByteSequence> stateMap();

    static AccountState deserializer(InputStream inputStream) throws IOException {
        ImmutableAccountState.Builder builder = ImmutableAccountState.builder();
        long bytesLength = Deserialization.readLength(inputStream);

        long entryCount = Deserialization.readLength(inputStream);

        for (int i = 0; i < entryCount; i ++) {
            long keyLength = Deserialization.readLength(inputStream);
            ByteArray key = Deserialization.readByteArray(inputStream, (int)keyLength);

            long valueLength = Deserialization.readLength(inputStream);
            ByteArray value = Deserialization.readByteArray(inputStream, (int)valueLength);

            builder.putStateMap(key, value);
        }

        return builder.build();
    }
}
