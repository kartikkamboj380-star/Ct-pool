.class final Lcom/google/android/gms/common/internal/a;
.super Lcom/google/android/gms/common/internal/zag;
.source "SourceFile"


# instance fields
.field final synthetic m:Landroid/content/Intent;

.field final synthetic n:Landroid/app/Activity;

.field final synthetic o:I


# direct methods
.method constructor <init>(Landroid/content/Intent;Landroid/app/Activity;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/internal/a;->m:Landroid/content/Intent;

    iput-object p2, p0, Lcom/google/android/gms/common/internal/a;->n:Landroid/app/Activity;

    iput p3, p0, Lcom/google/android/gms/common/internal/a;->o:I

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/zag;-><init>()V

    return-void
.end method


# virtual methods
.method public final zaa()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/common/internal/a;->m:Landroid/content/Intent;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/common/internal/a;->n:Landroid/app/Activity;

    iget v2, p0, Lcom/google/android/gms/common/internal/a;->o:I

    invoke-virtual {v1, v0, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    :cond_0
    return-void
.end method
