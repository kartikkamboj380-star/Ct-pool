.class public final enum Lcom/google/android/gms/measurement/internal/A3$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/measurement/internal/A3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation


# static fields
.field public static final enum n:Lcom/google/android/gms/measurement/internal/A3$a;

.field public static final enum o:Lcom/google/android/gms/measurement/internal/A3$a;

.field public static final enum p:Lcom/google/android/gms/measurement/internal/A3$a;

.field public static final enum q:Lcom/google/android/gms/measurement/internal/A3$a;

.field private static final synthetic r:[Lcom/google/android/gms/measurement/internal/A3$a;


# instance fields
.field public final m:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/google/android/gms/measurement/internal/A3$a;

    const/4 v1, 0x0

    const-string v2, "ad_storage"

    const-string v3, "AD_STORAGE"

    invoke-direct {v0, v3, v1, v2}, Lcom/google/android/gms/measurement/internal/A3$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/measurement/internal/A3$a;->n:Lcom/google/android/gms/measurement/internal/A3$a;

    new-instance v1, Lcom/google/android/gms/measurement/internal/A3$a;

    const/4 v2, 0x1

    const-string v3, "analytics_storage"

    const-string v4, "ANALYTICS_STORAGE"

    invoke-direct {v1, v4, v2, v3}, Lcom/google/android/gms/measurement/internal/A3$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/google/android/gms/measurement/internal/A3$a;->o:Lcom/google/android/gms/measurement/internal/A3$a;

    new-instance v2, Lcom/google/android/gms/measurement/internal/A3$a;

    const/4 v3, 0x2

    const-string v4, "ad_user_data"

    const-string v5, "AD_USER_DATA"

    invoke-direct {v2, v5, v3, v4}, Lcom/google/android/gms/measurement/internal/A3$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lcom/google/android/gms/measurement/internal/A3$a;->p:Lcom/google/android/gms/measurement/internal/A3$a;

    new-instance v3, Lcom/google/android/gms/measurement/internal/A3$a;

    const/4 v4, 0x3

    const-string v5, "ad_personalization"

    const-string v6, "AD_PERSONALIZATION"

    invoke-direct {v3, v6, v4, v5}, Lcom/google/android/gms/measurement/internal/A3$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lcom/google/android/gms/measurement/internal/A3$a;->q:Lcom/google/android/gms/measurement/internal/A3$a;

    filled-new-array {v0, v1, v2, v3}, [Lcom/google/android/gms/measurement/internal/A3$a;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/measurement/internal/A3$a;->r:[Lcom/google/android/gms/measurement/internal/A3$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/A3$a;->m:Ljava/lang/String;

    return-void
.end method

.method public static values()[Lcom/google/android/gms/measurement/internal/A3$a;
    .locals 1

    sget-object v0, Lcom/google/android/gms/measurement/internal/A3$a;->r:[Lcom/google/android/gms/measurement/internal/A3$a;

    invoke-virtual {v0}, [Lcom/google/android/gms/measurement/internal/A3$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/measurement/internal/A3$a;

    return-object v0
.end method
