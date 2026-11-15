.class public final synthetic Lb4/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD4/b;


# instance fields
.field public final synthetic a:Lb4/n;

.field public final synthetic b:Lb4/c;


# direct methods
.method public synthetic constructor <init>(Lb4/n;Lb4/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb4/k;->a:Lb4/n;

    iput-object p2, p0, Lb4/k;->b:Lb4/c;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lb4/k;->a:Lb4/n;

    iget-object v1, p0, Lb4/k;->b:Lb4/c;

    invoke-static {v0, v1}, Lb4/n;->j(Lb4/n;Lb4/c;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
