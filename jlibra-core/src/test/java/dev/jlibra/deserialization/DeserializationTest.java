package dev.jlibra.deserialization;

import dev.jlibra.type.AccountState;
import dev.jlibra.proof.SparseMerkleProof;
import dev.jlibra.proof.TransactionAccumulatorProof;
import dev.jlibra.type.TransactionInfo;
import dev.jlibra.serialization.ByteArray;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DeserializationTest {

    @Test
    public void testDeserializationTransactionAccumulatorProof() throws IOException {
        String hex = "1120414343554d554c41544f525f504c414345484f4c4445525f484153480000000020414343554d554c41544f525f504c414345484f4c4445525f484153480000000020414343554d554c41544f525f504c414345484f4c4445525f484153480000000020c3a04cc2ee4f16643c5a279ddfa9f69b8449887632b3bb58c81a9b254da5c257201159c2cd29f3ac65390828b1126878905dd93a2ec99a0db5152559909af83c2d2001d8f09ac1585aeab99baf33b788a3b365ee47e12d0d2edc6a2ed869d2f30e1320414343554d554c41544f525f504c414345484f4c4445525f48415348000000002091343789a7adb0f1a9bc9eade36289491462a59b19d2fbca617b87767738a76a20c9d07863cfabca13f8a57b1e0c3b798797c7e79a8c16d40f90c742e3432b186020cc4730066475f014245d9312cc2aab2062247ceb5d14d55969b49cfc11517c3320414343554d554c41544f525f504c414345484f4c4445525f484153480000000020414343554d554c41544f525f504c414345484f4c4445525f484153480000000020414343554d554c41544f525f504c414345484f4c4445525f484153480000000020414343554d554c41544f525f504c414345484f4c4445525f484153480000000020414343554d554c41544f525f504c414345484f4c4445525f4841534800000000202fc18bbe379fd97143f2f34267a563fc57ca95bbca768c450a725e0a0cde36ce20404511441b19c4971acc49ba6b04b97acca1036fc4ca5776562d365d13512bdd";
        InputStream input =  new ByteArrayInputStream(ByteArray.from(hex).toArray());
        TransactionAccumulatorProof proof = TransactionAccumulatorProof.deserializer(input);
        System.out.println(proof);
    }

    @Test
    public void testDeserializationTransactionInfo() throws IOException {
        String hex = "209419cce518e875ad126832db95fc89c8e82c89bb0962e35862fcbf0dfe728d2920d5184f0517c8a8c9b5a5e2fe62ae6b70984d1dbb70362ec4858e94b0b3bd5777207d05d28d16a9896bea26487c13f0078183b432b3a8d37b6f8066d3c5e20c0bff0000000000000000a10f000000000000";
        InputStream input =  new ByteArrayInputStream(ByteArray.from(hex).toArray());
        TransactionInfo txInfo = TransactionInfo.deserializer(input);
        System.out.println(txInfo);
    }

    @Test
    public void testDeserializationSparseMerkleProof() throws IOException {
        String hex = "0120765761d44f4db929ef8c0ab65fc368a22f1650cdafcb642508d04d14f5ea427e2065acdb7130c60f68dcf9e50343dc50d0592e1d8cb0ae0e28b2e0304bccfd08710520ea3d764907a79a836ea32bf05ba08287ab135d5b7492fee420617b470791cfc1205350415253455f4d45524b4c455f504c414345484f4c4445525f484153480000205350415253455f4d45524b4c455f504c414345484f4c4445525f484153480000209244a5f14b8b038b12997527a2e173756d9019de1f73610f73cf469a50fdf1a1202334dbcd65b68aca4323397fd4ebc801671857055ce7fc53eb66717a5e6b15d3";
        InputStream input =  new ByteArrayInputStream(ByteArray.from(hex).toArray());
        SparseMerkleProof smp = SparseMerkleProof.deserializer(input);
        System.out.println(smp);
    }

    @Test
    public void testDeserializationAccountBlob() throws IOException {
        String hex = "cf02042101173823d09c529b419fb2dda66694fc92f53dd6560fa03ee6214c1d7ac26a612d0800e1f50500000000210147850468166c2531a9a8f1f361de0df6f5ea2e2b6bb31b95e17eeff171793dc83407746573746e65741268747470733a2f2f6c696272612e6f72672fffffffffffffffff10000000000000000000000000000000002101e1ecbc471a0bfd3a472c114bc689b1d01f3fd6d13b7332c789e852f18e2c997c180200000000000000066a792c5904f4a6944307b742f993702101f9099c53a4d049d6500a92f66d1fae9704f6668fe41f6dc0c9469eba397d6d8e6e20a5b8a25767f207b80d5fde3259cd9548066a792c5904f4a6944307b742f9937000000100000000000000180000000000000000066a792c5904f4a6944307b742f993700000000000000000180100000000000000066a792c5904f4a6944307b742f99370000000000000000000";
        InputStream input =  new ByteArrayInputStream(ByteArray.from(hex).toArray());
        AccountState as = AccountState.deserializer(input);
        System.out.println(as);
    }
}