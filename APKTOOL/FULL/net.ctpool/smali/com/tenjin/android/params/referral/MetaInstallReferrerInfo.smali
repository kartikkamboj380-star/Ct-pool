.class public Lcom/tenjin/android/params/referral/MetaInstallReferrerInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final actualTimestamp:J

.field private final installReferrer:Ljava/lang/String;

.field private final isClickThrough:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;JZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tenjin/android/params/referral/MetaInstallReferrerInfo;->installReferrer:Ljava/lang/String;

    iput-wide p2, p0, Lcom/tenjin/android/params/referral/MetaInstallReferrerInfo;->actualTimestamp:J

    iput-boolean p4, p0, Lcom/tenjin/android/params/referral/MetaInstallReferrerInfo;->isClickThrough:Z

    return-void
.end method


# virtual methods
.method public getActualTimestamp()J
    .locals 2

    iget-wide v0, p0, Lcom/tenjin/android/params/referral/MetaInstallReferrerInfo;->actualTimestamp:J

    return-wide v0
.end method

.method public getInstallReferrer()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/tenjin/android/params/referral/MetaInstallReferrerInfo;->installReferrer:Ljava/lang/String;

    return-object v0
.end method

.method public isClickThrough()Z
    .locals 1

    iget-boolean v0, p0, Lcom/tenjin/android/params/referral/MetaInstallReferrerInfo;->isClickThrough:Z

    return v0
.end method
