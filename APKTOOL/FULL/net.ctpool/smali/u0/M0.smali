.class public final synthetic Lu0/M0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz3/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(ILjava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lu0/M0;->a:I

    iput-object p2, p0, Lu0/M0;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a(Lz3/l;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lu0/M0;->a:I

    iget-object v1, p0, Lu0/M0;->b:Ljava/util/List;

    invoke-static {v0, v1, p1}, Lu0/R0;->f(ILjava/util/List;Lz3/l;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method
