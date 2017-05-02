package graph.electric.util;

/**
 * Created by Administrator on 2017/4/28.
 */
public class ContentUtil {
    public static String yxExportHeader = "EQUIP_ID,TG_ID,ORG_NO,CONS_ID,TYPE_CODE,CHG_REMARK,TRAN_NAME,INST_ADDR," +
            "INST_DATE,PLATE_CAP,FRST_RUN_DATE,ACTUAL_START_DATE,ACTUAL_STOP_USE_DATE,PLAN_RESUME_DATE,MS_FLAG," +
            "RUN_STATUS_CODE,PUB_PRIV_FLAG,CHG_CAP,DUE_DATE,PROTECT_MODE,GROUND_FLAG,FRSTSIDE_VOLT_CODE," +
            "SNDSIDE_VOLT_CODE,MODEL_NO,K_VALUE,FACTORY_NAME,MADE_NO,MADE_DATE,WIRE_GROUP_CODE,COOL_MODE,RV_HV,RC_HV," +
            "RV_MV,RC_MV,RV_LV,RC_LV,SC_RESI,K_CURRENT,TEST_DATE,TEST_CYCLE,PR_CODE,MAIN_WIRING_MODE,OIL_NO," +
            "SUBJOINT_GRADE,SUBJOINT_LOC,GROUND_RESI,RP_TL_VALUE,AP_TL_VALUE,TS_NO,TS_ALG_FLAG,PMS_EQUIP_ID," +
            "PMS_SUPER_ID,PMS_SUPER_NAME,PMS_SUPER_TYPE,POS_X,POS_Y,POS_Z,SOURCE_CHANGE_TIME,TARGET_WRITE_TIME," +
            "SOURCE_CHANGE_TIME2,TARGET_WRITE_TIME2,CIM_NAME,CIM_M_RID,CONTAINER,C_EC_RESOURCEID,CIM_ALIAS_NAME," +
            "LOCATION_RESOURCEID,CIM_NORMALLY_IN_SERVICE,CIM_VECTOR_GROUP,C_LOCATION_RESOURCEID,EC_RESOURCEID," +
            "RESOURCEID,CIM_AGGREGATE,RECORDTIMESTAMP,RECORDSTATUS";
    public static String scExportHeader = "OBJ_ID,SBBM,SBMC,DYDJMC,SYXZ,XH,SCCJ,CCBH,CCRQ,TYRQ,XS,JYJZ,WZKGFJDS," +
            "WZKGFJWZ,JYNRDJ,EDRL,ZKDY,KZDL,DLSH,KZSH,JXZB,DYB,GYCEDDL,DYCEDDL,JDDZ,KZRL,YH,YZ,ZZ,YXZT,ZZMC,XLMC," +
            "DJSJ,YWDWMC,SSDSMC,ZCDWMC,LJZBH,LX,GDQY,DQTZ,SSDKX,SSKXXD,XLID";

    public static String[] getYxHeader() {
        return yxExportHeader.split(",");
    }

    public static String[] getScHeader() {
        return scExportHeader.split(",");
    }
}