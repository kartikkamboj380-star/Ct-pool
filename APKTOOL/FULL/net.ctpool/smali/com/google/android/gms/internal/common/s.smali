.class public abstract Lcom/google/android/gms/internal/common/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lcom/google/android/gms/internal/common/p;

.field private static volatile b:Lcom/google/android/gms/internal/common/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/common/r;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/common/r;-><init>(Lcom/google/android/gms/internal/common/q;)V

    sput-object v0, Lcom/google/android/gms/internal/common/s;->a:Lcom/google/android/gms/internal/common/p;

    sput-object v0, Lcom/google/android/gms/internal/common/s;->b:Lcom/google/android/gms/internal/common/p;

    return-void
.end method

.method public static a()Lcom/google/android/gms/internal/common/p;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/common/s;->b:Lcom/google/android/gms/internal/common/p;

    return-object v0
.end method
