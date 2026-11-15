.class final Ll3/l;
.super Ll3/e;
.source "SourceFile"


# instance fields
.field final synthetic a:Ll3/m;


# direct methods
.method constructor <init>(Ll3/m;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ll3/l;->a:Ll3/m;

    .line 2
    .line 3
    invoke-direct {p0}, Ll3/e;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final K(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ll3/l;->a:Ll3/m;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(Lcom/google/android/gms/common/api/Result;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
