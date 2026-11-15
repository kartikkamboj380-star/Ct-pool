.class public final synthetic Lcom/google/android/gms/internal/auth/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/auth/U;


# instance fields
.field public final synthetic m:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/auth/C;->m:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/auth/C;->m:Landroid/content/Context;

    sget v1, Lcom/google/android/gms/internal/auth/M;->k:I

    invoke-static {v0}, Lcom/google/android/gms/internal/auth/y;->a(Landroid/content/Context;)Lcom/google/android/gms/internal/auth/S;

    move-result-object v0

    return-object v0
.end method
