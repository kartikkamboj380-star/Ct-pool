.class public Lcom/tenjin/android/utils/MsaOaid$MsaErrorCode;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tenjin/android/utils/MsaOaid;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "MsaErrorCode"
.end annotation


# static fields
.field public static final INIT_ERROR_BEGIN:I = 0xf63e2

.field public static final INIT_ERROR_DEVICE_NOSUPPORT:I = 0xf63e4

.field public static final INIT_ERROR_LOAD_CONFIGFILE:I = 0xf63e5

.field public static final INIT_ERROR_MANUFACTURER_NOSUPPORT:I = 0xf63e3

.field public static final INIT_ERROR_RESULT_DELAY:I = 0xf63e6

.field public static final INIT_HELPER_CALL_ERROR:I = 0xf63e7


# instance fields
.field final synthetic this$0:Lcom/tenjin/android/utils/MsaOaid;


# direct methods
.method public constructor <init>(Lcom/tenjin/android/utils/MsaOaid;)V
    .locals 0

    iput-object p1, p0, Lcom/tenjin/android/utils/MsaOaid$MsaErrorCode;->this$0:Lcom/tenjin/android/utils/MsaOaid;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
