.class abstract Lcom/google/android/gms/internal/auth/P0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lcom/google/android/gms/internal/auth/P0;

.field private static final b:Lcom/google/android/gms/internal/auth/P0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/auth/L0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/auth/L0;-><init>(Lcom/google/android/gms/internal/auth/K0;)V

    sput-object v0, Lcom/google/android/gms/internal/auth/P0;->a:Lcom/google/android/gms/internal/auth/P0;

    new-instance v0, Lcom/google/android/gms/internal/auth/N0;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/auth/N0;-><init>(Lcom/google/android/gms/internal/auth/M0;)V

    sput-object v0, Lcom/google/android/gms/internal/auth/P0;->b:Lcom/google/android/gms/internal/auth/P0;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/auth/O0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static c()Lcom/google/android/gms/internal/auth/P0;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/auth/P0;->a:Lcom/google/android/gms/internal/auth/P0;

    return-object v0
.end method

.method static d()Lcom/google/android/gms/internal/auth/P0;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/auth/P0;->b:Lcom/google/android/gms/internal/auth/P0;

    return-object v0
.end method


# virtual methods
.method abstract a(Ljava/lang/Object;J)V
.end method

.method abstract b(Ljava/lang/Object;Ljava/lang/Object;J)V
.end method
