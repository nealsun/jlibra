package dev.jlibra;

import dev.jlibra.serialization.ByteArray;
import dev.jlibra.serialization.lcs.LCS;
import dev.jlibra.serialization.lcs.LCSSerializer;
import dev.jlibra.transaction.*;
import dev.jlibra.type.*;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.junit.BeforeClass;
import org.junit.Test;

import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AccessPathTest {

    @Test
    public void testAccountResource() {
        ImmutableResourceKey resourceKey = ImmutableResourceKey.builder()
                .address(AccountAddress.fromHexString("066a792c5904f4a6944307b742f99370"))
                .type(new AccountStructTag())
                .build();

        ByteArray byteArray = ResourceKey.accessBytes(resourceKey);
        System.out.println(byteArray.toString());

    }

    @Test
    public void testAccountBalanceLBRResource() {
        CurrencyStructTag lbrStructTag = new CurrencyStructTag("LBR");
        AccountBalanceStructTag accountBalanceStructTag = new AccountBalanceStructTag(lbrStructTag);
        ImmutableResourceKey resourceKey = ImmutableResourceKey.builder()
                .address(AccountAddress.fromHexString("066a792c5904f4a6944307b742f99370"))
                .type(accountBalanceStructTag)
                .build();

        ByteArray byteArray = ResourceKey.accessBytes(resourceKey);
        System.out.println(byteArray.toString());

    }

    @Test
    public void testAccountBalanceCoin1Resource() {
        CurrencyStructTag lbrStructTag = new CurrencyStructTag("Coin2");
        AccountBalanceStructTag accountBalanceStructTag = new AccountBalanceStructTag(lbrStructTag);
        ImmutableResourceKey resourceKey = ImmutableResourceKey.builder()
                .address(AccountAddress.fromHexString("066a792c5904f4a6944307b742f99370"))
                .type(accountBalanceStructTag)
                .build();

        ByteArray byteArray = ResourceKey.accessBytes(resourceKey);
        System.out.println(byteArray.toString());

    }

    @Test
    public void testAccountBalanceCoin2Resource() {
        CurrencyStructTag lbrStructTag = new CurrencyStructTag("Coin2");
        AccountBalanceStructTag accountBalanceStructTag = new AccountBalanceStructTag(lbrStructTag);
        ImmutableResourceKey resourceKey = ImmutableResourceKey.builder()
                .address(AccountAddress.fromHexString("066a792c5904f4a6944307b742f99370"))
                .type(accountBalanceStructTag)
                .build();

        ByteArray byteArray = ResourceKey.accessBytes(resourceKey);
        System.out.println(byteArray.toString());

    }

    @Test
    public void testEventHandleResource() {
        ImmutableResourceKey resourceKey = ImmutableResourceKey.builder()
                .address(AccountAddress.fromHexString("066a792c5904f4a6944307b742f99370"))
                .type(new StructTag() {
                    @Override
                    public AccountAddress getAddress() {
                        return AccountAddress.fromHexString("00000000000000000000000000000000");
                    }

                    @Override
                    public String getModule() {
                        return "Event";
                    }

                    @Override
                    public String getName() {
                        return "EventHandleGenerator";
                    }

                    @Override
                    public List<TypeTag> getTypeParams() {
                        return Arrays.asList();
                        //CurrencyStructTag currencyStructTag = new CurrencyStructTag("LBR");
                        //return Arrays.asList(new StructTypeTag() {
                        //    @Override
                        //    public StructTag structTag() {
                        //        return currencyStructTag;
                        //    }
                        //});
                    }
                })
                .build();

        ByteArray byteArray = ResourceKey.accessBytes(resourceKey);
        System.out.println(byteArray.toString());

    }

    @Test
    public void testAccountRoleResource() {
        ImmutableResourceKey resourceKey = ImmutableResourceKey.builder()
                .address(AccountAddress.fromHexString("066a792c5904f4a6944307b742f99370"))
                .type(new StructTag() {
                    @Override
                    public AccountAddress getAddress() {
                        return AccountAddress.fromHexString("00000000000000000000000000000000");
                    }

                    @Override
                    public String getModule() {
                        return "LibraAccount";
                    }

                    @Override
                    public String getName() {
                        return "Role";
                    }

                    @Override
                    public List<TypeTag> getTypeParams() {
                        StructTag structTag = new StructTag() {
                            @Override
                            public AccountAddress getAddress() {
                                return AccountAddress.fromHexString("00000000000000000000000000000000");
                            }

                            @Override
                            public String getModule() {
                                return "VASP";
                            }

                            @Override
                            public String getName() {
                                return "ParentVASP";
                            }

                            @Override
                            public List<TypeTag> getTypeParams() {
                                return Arrays.asList();
                            }
                        };
                        return Arrays.asList(new StructTypeTag() {
                            @Override
                            public StructTag structTag() {
                                return structTag;
                            }
                        });
                    }
                })
                .build();

        ByteArray byteArray = ResourceKey.accessBytes(resourceKey);
        System.out.println(byteArray.toString());

    }

    @Test
    public void testModuleResource() {
        ImmutableModuleId moduleId = ImmutableModuleId.builder()
                .address(AccountAddress.fromHexString("066a792c5904f4a6944307b742f99370"))
                .name("LibraX")
                .build();

        ByteArray byteArray = ModuleId.accessBytes(moduleId);
        System.out.println(byteArray.toString());

    }
}

class CurrencyStructTag implements StructTag {
    private String module;

    public CurrencyStructTag(String module) {
        this.module = module;
    }

    public AccountAddress getAddress() {
        return AccountAddress.fromHexString("00000000000000000000000000000000");
    }

    public String getModule() {
        return module;
    }

    public String getName() {
        return "T";
    }

    public List<TypeTag> getTypeParams() {
        return new ArrayList<>();
    }
}

class AccountBalanceStructTag implements StructTag {
    private List<TypeTag> typeParams;

    public AccountBalanceStructTag(CurrencyStructTag currencyStructTag) {
        this.typeParams = Arrays.asList(new StructTypeTag() {
            @Override
            public StructTag structTag() {
                return currencyStructTag;
            }
        });
    }

    public AccountAddress getAddress() {
        return AccountAddress.fromHexString("00000000000000000000000000000000");
    }

    public String getModule() {
        return "LibraAccount";
    }

    public String getName() {
        return "Balance";
    }

    public List<TypeTag> getTypeParams() {
        return typeParams;
    }
}