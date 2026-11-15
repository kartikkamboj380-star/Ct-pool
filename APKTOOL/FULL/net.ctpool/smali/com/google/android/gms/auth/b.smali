.class final enum Lcom/google/android/gms/auth/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum m:Lcom/google/android/gms/auth/b;

.field public static final enum n:Lcom/google/android/gms/auth/b;

.field public static final enum o:Lcom/google/android/gms/auth/b;

.field private static final synthetic p:[Lcom/google/android/gms/auth/b;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/google/android/gms/auth/b;

    const-string v1, "LEGACY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/auth/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/android/gms/auth/b;->m:Lcom/google/android/gms/auth/b;

    new-instance v1, Lcom/google/android/gms/auth/b;

    const-string v2, "AUTH_INSTANTIATION"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/auth/b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/google/android/gms/auth/b;->n:Lcom/google/android/gms/auth/b;

    new-instance v2, Lcom/google/android/gms/auth/b;

    const-string v3, "CALLER_INSTANTIATION"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lcom/google/android/gms/auth/b;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lcom/google/android/gms/auth/b;->o:Lcom/google/android/gms/auth/b;

    filled-new-array {v0, v1, v2}, [Lcom/google/android/gms/auth/b;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/auth/b;->p:[Lcom/google/android/gms/auth/b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static values()[Lcom/google/android/gms/auth/b;
    .locals 1

    sget-object v0, Lcom/google/android/gms/auth/b;->p:[Lcom/google/android/gms/auth/b;

    invoke-virtual {v0}, [Lcom/google/android/gms/auth/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/auth/b;

    return-object v0
.end method
