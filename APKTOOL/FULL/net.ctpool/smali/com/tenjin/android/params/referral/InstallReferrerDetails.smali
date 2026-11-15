.class public Lcom/tenjin/android/params/referral/InstallReferrerDetails;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field clickTimestamp:J

.field installTimestamp:J

.field url:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tenjin/android/params/referral/InstallReferrerDetails;->url:Ljava/lang/String;

    iput-wide p2, p0, Lcom/tenjin/android/params/referral/InstallReferrerDetails;->installTimestamp:J

    iput-wide p4, p0, Lcom/tenjin/android/params/referral/InstallReferrerDetails;->clickTimestamp:J

    return-void
.end method
