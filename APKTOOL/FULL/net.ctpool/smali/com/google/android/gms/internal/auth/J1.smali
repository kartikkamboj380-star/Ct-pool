.class public final Lcom/google/android/gms/internal/auth/J1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/auth/U;


# static fields
.field private static final n:Lcom/google/android/gms/internal/auth/J1;


# instance fields
.field private final m:Lcom/google/android/gms/internal/auth/U;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/auth/J1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/auth/J1;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/auth/J1;->n:Lcom/google/android/gms/internal/auth/J1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/auth/L1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/auth/L1;-><init>()V

    invoke-static {v0}, Lcom/google/android/gms/internal/auth/Z;->b(Ljava/lang/Object;)Lcom/google/android/gms/internal/auth/U;

    move-result-object v0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Lcom/google/android/gms/internal/auth/Z;->a(Lcom/google/android/gms/internal/auth/U;)Lcom/google/android/gms/internal/auth/U;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/auth/J1;->m:Lcom/google/android/gms/internal/auth/U;

    return-void
.end method

.method public static c()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/auth/J1;->n:Lcom/google/android/gms/internal/auth/J1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/auth/J1;->b()Lcom/google/android/gms/internal/auth/K1;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/auth/K1;->a()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/auth/J1;->b()Lcom/google/android/gms/internal/auth/K1;

    move-result-object v0

    return-object v0
.end method

.method public final b()Lcom/google/android/gms/internal/auth/K1;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/auth/J1;->m:Lcom/google/android/gms/internal/auth/U;

    invoke-interface {v0}, Lcom/google/android/gms/internal/auth/U;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/auth/K1;

    return-object v0
.end method
