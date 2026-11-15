.class public final synthetic Lcom/google/android/gms/internal/auth/W;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/auth/U;


# static fields
.field public static final synthetic m:Lcom/google/android/gms/internal/auth/W;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/auth/W;

    invoke-direct {v0}, Lcom/google/android/gms/internal/auth/W;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/auth/W;->m:Lcom/google/android/gms/internal/auth/W;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method
