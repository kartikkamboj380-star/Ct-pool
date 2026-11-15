.class public final Lcom/google/android/gms/internal/measurement/s7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LU3/k;


# static fields
.field private static n:Lcom/google/android/gms/internal/measurement/s7;


# instance fields
.field private final m:LU3/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/s7;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/s7;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/s7;->n:Lcom/google/android/gms/internal/measurement/s7;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/measurement/u7;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/u7;-><init>()V

    invoke-static {v0}, LU3/l;->b(Ljava/lang/Object;)LU3/k;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/s7;->m:LU3/k;

    return-void
.end method

.method public static a()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/s7;->n:Lcom/google/android/gms/internal/measurement/s7;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/s7;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/v7;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/v7;->a()Z

    move-result v0

    return v0
.end method

.method public static b()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/s7;->n:Lcom/google/android/gms/internal/measurement/s7;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/s7;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/v7;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/v7;->zzb()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final synthetic get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/s7;->m:LU3/k;

    invoke-interface {v0}, LU3/k;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/v7;

    return-object v0
.end method
