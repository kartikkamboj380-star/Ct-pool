.class public final Lcom/google/android/gms/internal/auth/v0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final b:Lcom/google/android/gms/internal/auth/v0;


# instance fields
.field private final a:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/auth/v0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/auth/v0;-><init>(Z)V

    sput-object v0, Lcom/google/android/gms/internal/auth/v0;->b:Lcom/google/android/gms/internal/auth/v0;

    return-void
.end method

.method constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/auth/v0;->a:Ljava/util/Map;

    return-void
.end method
